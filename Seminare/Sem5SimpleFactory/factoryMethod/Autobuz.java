package factoryMethod;

public class Autobuz extends TransportVehicle{

	public Autobuz(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void showInfo() {
		System.out.println("The bus has: "+ toString());
		
	}



	@Override
	public void moveType() {
		System.out.println("Moving type: electric");
	}

}
