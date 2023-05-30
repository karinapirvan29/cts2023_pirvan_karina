package Mods;

import ro.ase.acs.persoana.model.IPachet;

public class FakePachet implements IPachet{
	
	private double pretValue;

	@Override
	public boolean poateRezerva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getPret() {
		// TODO Auto-generated method stub
		return pretValue;
	}

	public void setPretValue(double pretValue) {
		this.pretValue = pretValue;
	}
	
	

}
