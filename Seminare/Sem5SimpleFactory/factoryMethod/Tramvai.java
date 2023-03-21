package factoryMethod;

public class Tramvai extends TransportVehicle{

	public Tramvai(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void showInfo() {
		System.out.println("The tram has: "+ toString());
		
	}



	@Override
	public void moveType() {
		System.out.println("Moving type: underground");
	}
	
}
