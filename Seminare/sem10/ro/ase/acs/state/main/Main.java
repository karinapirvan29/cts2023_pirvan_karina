package ro.ase.acs.state.main;

import ro.ase.acs.state.classes.Bus;
import ro.ase.acs.state.classes.IBusState;

public class Main {

	public static void main(String[] args) {
		
		Bus bus = new Bus("B102");
		bus.sendToService();
		bus.arriveAtTheEndOfTheRoute();
		bus.leaveEnRoute();
		bus.sendToService();
		bus.arriveAtTheEndOfTheRoute();
		
	}
}
