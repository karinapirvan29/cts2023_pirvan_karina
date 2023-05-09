package ro.ase.acs.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
	
	private String numeRestaurant;
	
	private List<IClient> clienti;;

	public Restaurant(String numeRestaurant) {
		this.numeRestaurant=numeRestaurant;
		clienti=new ArrayList<>();
	}
	
	
	@Override
	public void abonareClient(IClient client) {
		clienti.add(client);
		
	}

	@Override
	public void dezabonareClient(IClient client) {
		clienti.remove(client);
		
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for( IClient i : clienti) {
			i.primNotif("Restaurantul "+this.numeRestaurant+" iti trimitem notificarea: "+mesaj);
		}
	}

	
	public void adaugaMeniuNou() {
	    trimiteNotificare("Am adaugat un meniu nou");
	}
	
	public void adaugareDiscount(int discount) {
		trimiteNotificare("HEY! Avem un nou discount in valoare de:  "+discount);
	}
	
}
