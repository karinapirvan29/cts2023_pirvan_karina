package ro.ase.simpleFactory;

public class Metro implements TransportVehicle{

	private int noSeats;
	
	protected Metro(int noSeats) {
		this.noSeats=noSeats;
	}
	
	@Override
	public void showInfo() {
		System.out.println("The metro has: "+this.noSeats+" seats");
		
	}



	@Override
	public void movingType() {
		System.out.println("Moving type: underground");

		
	}

}
