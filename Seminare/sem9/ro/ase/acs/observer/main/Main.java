package ro.ase.acs.observer.main;

import ro.ase.acs.observer.classes.Client;
import ro.ase.acs.observer.classes.IClient;
import ro.ase.acs.observer.classes.IRestaurant;
import ro.ase.acs.observer.classes.Restaurant;

public class Main {

	
	public static void main(String[] args) {
		IClient client1=new Client("Maricica");
		IClient client2=new Client("Popica");
		IClient client3=new Client("Nicu");
		
		Restaurant restaurant=new Restaurant("Restaurant bun");
		
		restaurant.adaugareDiscount(23);
		
		restaurant.abonareClient(client3);
		restaurant.adaugaMeniuNou();
		
		restaurant.abonareClient(client2);
		restaurant.abonareClient(client1);
		restaurant.dezabonareClient(client3);
		restaurant.adaugareDiscount(40);
		
	}
}
