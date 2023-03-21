package ro.ase.simpleFactory;

public class Bus implements TransportVehicle{

	private int noSeats;
	
	
	
	protected Bus(int noSeats) {
		super();
		this.noSeats = noSeats;
	}



	@Override
	public void showInfo() {
		System.out.println("The bus has: "+this.noSeats+" seats");
		
	}



	@Override
	public void movingType() {
		System.out.println("Moving type: electric");
		
	}

	
}
