package ro.ase.acs.command.main;

import ro.ase.acs.command.classes.Autobuz;
import ro.ase.acs.command.classes.Automobil;
import ro.ase.acs.command.classes.CommandPlecareCursa;
import ro.ase.acs.command.classes.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		ManagerComenzi managerComenzi=new ManagerComenzi();
		
		Automobil autobuz=new Autobuz(13);
		managerComenzi.invocaComanda(new CommandPlecareCursa(10, new Autobuz(12) ));
		managerComenzi.invocaComanda(new CommandPlecareCursa(11, autobuz ));
		managerComenzi.invocaComanda(new CommandPlecareCursa(12, new Autobuz(13) ));
		managerComenzi.invocaComanda(new CommandPlecareCursa(11, autobuz));
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new CommandPlecareCursa(10, new Autobuz(23) ));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();

	}
}
