package ro.ase.acs.facade.classes;

public class Politie {

	public boolean areCazier(String cnp) {
		return cnp.charAt(cnp.length()-1)%2==0;
	}
	
	
}
