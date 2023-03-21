package factoryMethod;

public class FactoryTroleu implements Factory{

	
	@Override
	public TransportVehicle createObject(int noSeats) {
		
		return new Troleu(noSeats);
	}
}
