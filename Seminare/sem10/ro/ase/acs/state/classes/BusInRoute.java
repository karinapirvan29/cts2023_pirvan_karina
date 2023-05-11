package ro.ase.acs.state.classes;

public class BusInRoute implements IBusState{

	@Override
	public void changeState(Bus bus) {
		if(bus.getBusState() instanceof BusEndOfRoute) {
			System.out.println("The bus "+bus.getLicenceNo()+
			" has a new route");
			bus.setBusState(this);
		}else {
			System.out.println("Autobuzul "+bus.getLicenceNo()
		  	+" cannot live to the new route");
		  
		}
	}

}
