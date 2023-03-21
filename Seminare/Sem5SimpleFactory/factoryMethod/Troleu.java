package factoryMethod;
public class Troleu  extends TransportVehicle{

	public Troleu(int noSeats) {
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
