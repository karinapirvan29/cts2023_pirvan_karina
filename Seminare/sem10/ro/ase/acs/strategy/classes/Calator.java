package ro.ase.acs.strategy.classes;

public class Calator {
	private String nume;
	
	private ITipPlat plata;

	public Calator(String nume) {
		super();
		this.nume = nume;
		this.plata = plata;
	}

	public ITipPlat getPlata() {
		return plata;
	}

	public void setPlata(ITipPlat plata) {
		this.plata = plata;
	}
	
	public void platesteBilet(double pret) {
		this.plata.plateste(pret);
	}

}
