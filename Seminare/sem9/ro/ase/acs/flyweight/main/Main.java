package ro.ase.acs.flyweight.main;

import ro.ase.acs.flyweight.classes.BazaDeDateClienti;
import ro.ase.acs.flyweight.classes.Client;
import ro.ase.acs.flyweight.classes.IClient;
import ro.ase.acs.flyweight.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		BazaDeDateClienti clienti=new BazaDeDateClienti();
		
		Rezervare rezervare=new Rezervare(1,2,"18:30");
		Rezervare rezervare2=new Rezervare(2,3,"12:08");
		Rezervare rezervare3=new Rezervare(3,5,"17:37");
		
		IClient iclient=clienti.getClient("Ana", "947545345", "anai@gmail.com");
		iclient.afiseazaDetaliiRezervare(rezervare);
		
		clienti.getClient("Popica", "353465324", "popica@gmail.com").afiseazaDetaliiRezervare(rezervare2);
		clienti.getClient("", "947545345", "").afiseazaDetaliiRezervare(rezervare3); //optimizare pe partea de memorie
		
		Rezervare rezervare4=new Rezervare(4, 3, "15:34");
		clienti.getClient("", "947545345", "").afiseazaDetaliiRezervare(rezervare4);
		
		
	}
}
