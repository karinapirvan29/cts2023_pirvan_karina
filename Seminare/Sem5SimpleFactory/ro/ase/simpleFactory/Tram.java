package ro.ase.simpleFactory;

public class Tram implements TransportVehicle{

	private int noSeats;
	
	
	
	protected Tram(int noSeats) {
		super();
		this.noSeats = noSeats;
	}


    @Override
	public void showInfo() {
		System.out.println("The tram has: "+this.noSeats+" seats");
		
	}



	@Override
	public void movingType() {
		System.out.println("Moving type: wired");

		
	}

}
