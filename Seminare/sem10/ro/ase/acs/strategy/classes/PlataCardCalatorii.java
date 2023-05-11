package ro.ase.acs.strategy.classes;

public class PlataCardCalatorii implements ITipPlat {

	@Override
	public void plateste(double pretBilet) {
		System.out.println("Plata biletului in val de "+pretBilet+" a fost efectuata prin cardul de calatorii");;
		
	}

}
