package ro.ase.acs.command.classes;

public class Autobuz implements Automobil{

	private int numar;

	
	
	public Autobuz(int numar) {
		super();
		this.numar = numar;
	}



	@Override
	public void plecareInCursa(int nrLinie) {
		System.out.println("Autobuzul cu nr "+ this.numar+
				" pleaca pe cursa din linia "+nrLinie);
		
	}
}
