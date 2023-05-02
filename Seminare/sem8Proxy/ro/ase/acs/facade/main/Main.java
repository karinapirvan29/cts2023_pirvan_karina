package ro.ase.acs.facade.main;

import ro.ase.acs.facade.classes.Bilet;
import ro.ase.acs.facade.classes.Client;
import ro.ase.acs.facade.classes.Facade;

public class Main {
	public static void main(String[] args) {

		Client client1=new Client("bob","2956370829374");
		Client client2=new Client("gogu","2956370829375");
		
		Bilet bilet1=new Bilet(client1.getName());
		Bilet bilet2=new Bilet(client2.getName());
		
		Facade facade=new Facade();
		facade.permiteIntrare(client2, bilet2);
		facade.permiteIntrare(client1, bilet1);
	}
}
