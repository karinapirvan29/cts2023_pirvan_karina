package ro.ase.acs.strategy.classes;

public class PlataPrinSms implements ITipPlat{

	@Override
	public void plateste(double pretBilet) {
		System.out.println("Plata biletului in val de "+pretBilet+" a fost efectuata prin SMS");;

		
	}

}
