package ro.ase.acs.state.classes;

public class BusEndOfRoute implements IBusState{

	@Override
	public void changeState(Bus bus) {
		if(bus.getBusState() instanceof BusInRoute) {
			
		  	System.out.println("Autobuzul "+bus.getLicenceNo()
		  	+" has reached the end of the line");
		  	bus.setBusState(this);
		}else {
			System.out.println("Autobuzul "+bus.getLicenceNo()
		  	+" cannot reach the end of the line");
		  
		}
	}

}
