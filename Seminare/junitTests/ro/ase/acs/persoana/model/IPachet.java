package ro.ase.acs.persoana.model;

public interface IPachet {
	public boolean poateRezerva() ;
	public void aplicaDiscountVarstnici(int procent);
	public Double getPret();
}
