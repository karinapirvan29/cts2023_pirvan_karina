package Main;

import Adapter.Credit;
import Adapter.CreditAdapterClass;
import Adapter.CreditIpotecar;
import Adapter.NewFramework.CreditLeasing;
import AdapterObject.CreditAdapterObject;



public class Main {
	
	public static void afiseazaCredit(int suma, Credit c) {
		c.oferaCredit(suma);
	}

	public static void main(String[] args) {
		Credit ipotecar = new CreditIpotecar();
		afiseazaCredit(5000, ipotecar);
		CreditLeasing leasingCredit = new CreditLeasing();
		Credit adapter = new CreditAdapterClass();
		afiseazaCredit(2000, adapter);

		Credit adapterObjectCredit = new CreditAdapterObject(leasingCredit);
		afiseazaCredit(3000, adapterObjectCredit);
	}

}
