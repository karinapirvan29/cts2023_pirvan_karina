package Mods;

import ro.ase.acs.persoana.model.IPersoana;

public class FakePerson implements IPersoana{
	
	private String getSexValue;
	private int getVarstaValue;
	private boolean checkCNPValue;
	

	public void setGetSexValue(String getSexValue) {
		this.getSexValue = getSexValue;
	}

	public void setGetVarstaValue(int getVarstaValue) {
		this.getVarstaValue = getVarstaValue;
	}

	public void setCheckCNPValue(boolean checkCNPValue) {
		this.checkCNPValue = checkCNPValue;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}


}
