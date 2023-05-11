package ro.ase.acs.strategy.main;

import ro.ase.acs.strategy.classes.Calator;
import ro.ase.acs.strategy.classes.PlataCardBancar;
import ro.ase.acs.strategy.classes.PlataCardCalatorii;
import ro.ase.acs.strategy.classes.PlataPrinSms;

public class Main {

	public static void main(String[] args) {
		
		Calator calator=new Calator("Bogdan Ionel");
		calator.setPlata(new PlataCardBancar());
		calator.platesteBilet(30);
		
		calator.setPlata(new PlataPrinSms());
		calator.platesteBilet(45);
		
		calator.setPlata(new PlataCardCalatorii());
	    calator.platesteBilet(32);
	
	    calator.platesteBilet(33);
	    calator.setPlata(new PlataCardBancar());
	    calator.platesteBilet(67);
	}
}
