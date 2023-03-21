package ro.ase.simpleFactory.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ro.ase.simpleFactory.Bus;
import ro.ase.simpleFactory.TransportVehicle;
import ro.ase.simpleFactory.VehicleFactory;
import ro.ase.simpleFactory.VehicleType;

public class Main {

	public static void main(String[] args) {
		
		VehicleFactory factory= new VehicleFactory();
		try {
			TransportVehicle bus=factory.createObject(VehicleType.BUS, 34);
			TransportVehicle train=factory.createObject(VehicleType.TRAIN, 20);
			TransportVehicle tram=factory.createObject(VehicleType.TRAM, 18);
			List<TransportVehicle> transpList=new ArrayList<>();
			
			Collections.addAll(transpList, bus, train, tram);
			
			Collections.addAll(transpList, 
					factory.createObject(VehicleType.BUS, 36),
					factory.createObject(VehicleType.TRAIN, 40), 
					factory.createObject(VehicleType.TRAM, 58));
			
//			transpList.add(factory.createObject(VehicleType.BUS, 36));
//			transpList.add(factory.createObject(VehicleType.TRAIN, 40));
//			transpList.add(factory.createObject(VehicleType.TRAM, 58));
			
			for(TransportVehicle v : transpList) {
				v.showInfo();
			}
			
//			bus.showInfo();
//			train.showInfo();
//			tram.showInfo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
