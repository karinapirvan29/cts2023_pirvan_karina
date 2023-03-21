package factoryMethod;

public class FactoryTramvai implements Factory{
	
	@Override
	public TransportVehicle createObject(int noSeats) {
		
		return new Tramvai(noSeats);
	}

}
