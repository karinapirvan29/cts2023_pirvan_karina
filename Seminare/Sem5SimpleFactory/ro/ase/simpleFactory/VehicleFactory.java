package ro.ase.simpleFactory;

public class VehicleFactory {

	public TransportVehicle createObject(VehicleType vehicleType, int noSeats) throws Exception {
		
		switch(vehicleType) {
		case BUS:
			return new Bus(noSeats);
		case TRAM:
			return new Tram(noSeats);
		case TRAIN:
			return new Train(noSeats);
		case METRO:
			return new Metro(noSeats);
		default:
			throw new Exception("No such type found"); 
		}
		
		
	}
}
