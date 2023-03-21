package factoryMethod.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import factoryMethod.Factory;
import factoryMethod.FactoryAutobuz;
import factoryMethod.FactoryTroleu;
import factoryMethod.TransportVehicle;
import ro.ase.simpleFactory.VehicleType;

public class Main {
	
	public static void main(String[] args) {
		
		Factory fAutobuze=new FactoryAutobuz();
		Factory fTrolebuze=new FactoryTroleu();
		
		List<TransportVehicle> mijloaceTransport=new ArrayList<>();
		
		Collections.addAll(mijloaceTransport,
				fAutobuze.createObject( 36),
				fTrolebuze.createObject( 40), 
				fAutobuze.createObject( 58));
		
		for(TransportVehicle t : mijloaceTransport) {
			t.showInfo();
			t.moveType();
			System.out.println();
		}
		
	}

}
