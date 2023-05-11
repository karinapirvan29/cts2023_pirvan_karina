package ro.ase.acs.state.classes;

public class Bus{

	private IBusState busState;
	private String licenceNo;
	
	
	
	public Bus( String licenceNo) {
		super();
		this.busState = new BusEndOfRoute();
		this.licenceNo = licenceNo;
	}
	
	public IBusState getBusState() {
		return busState;
	}
	
	protected void setBusState(IBusState busState) {
		this.busState = busState;
	}
	
	public String getLicenceNo() {
		return licenceNo;
	}
	
	public void leaveEnRoute() {
		IBusState inRoute=new BusInRoute();
		inRoute.changeState(this);
	}
	
	public void sendToService() {
		IBusState service=new BusInService();
		service.changeState(this);
	}
	
	public void arriveAtTheEndOfTheRoute() {
		IBusState endRoute=new BusEndOfRoute();
		endRoute.changeState(this);
	}
	
}
