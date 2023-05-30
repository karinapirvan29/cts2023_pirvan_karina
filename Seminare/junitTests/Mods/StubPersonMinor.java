package Mods;

import ro.ase.acs.persoana.model.IPersoana;

public class StubPersonMinor implements IPersoana{

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return "F";
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 17;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}

}
