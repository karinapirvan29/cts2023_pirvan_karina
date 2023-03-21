package ro.ase.simpleFactory;

public class Train implements TransportVehicle{
	
	private int noSeats;
	
	

	protected Train(int noSeats) {
		super();
		this.noSeats = noSeats;
	}



	@Override
	public void showInfo() {
		System.out.println("The train has: "+this.noSeats+" seats");
		
	}



	@Override
	public void movingType() {
		System.out.println("Moving type: train racks");

		
	}

}
