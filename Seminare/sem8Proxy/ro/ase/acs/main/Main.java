package ro.ase.acs.main;

import ro.ase.acs.peoxy.classes.Client;
import ro.ase.acs.peoxy.classes.ITichetOffice;
import ro.ase.acs.peoxy.classes.Proxy;
import ro.ase.acs.peoxy.classes.TicketOffice;

public class Main {
	public static void main(String[] args) {

		Client cl1=new Client(18, "gigi");
		Client cl2=new Client(12,"gheorghe");
		
		ITichetOffice office=new TicketOffice();
		office.sellTichet(cl1);
		office.sellTichet(cl2);
		
		ITichetOffice proxy=new Proxy(office);
		proxy.sellTichet(cl2);
		proxy.sellTichet(cl1);
	}
}
