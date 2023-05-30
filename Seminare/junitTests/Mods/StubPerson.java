package Mods;

import ro.ase.acs.persoana.model.IPersoana;

public class StubPerson implements IPersoana{
	//returneaza valori hardcodate

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return "M";
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 18;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return true;
	}

}
