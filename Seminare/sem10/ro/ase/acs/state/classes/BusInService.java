package ro.ase.acs.state.classes;

public class BusInService implements IBusState{

	@Override
	public void changeState(Bus bus) {
		if(bus.getBusState() instanceof BusEndOfRoute) {
			System.out.println("The bus "+bus.getLicenceNo()
			+" has left to service");
			bus.setBusState(this);
		}else {
			System.out.println("Autobuzul "+bus.getLicenceNo()
		  	+" cannot reach the service");
		  
		}
	}

}
