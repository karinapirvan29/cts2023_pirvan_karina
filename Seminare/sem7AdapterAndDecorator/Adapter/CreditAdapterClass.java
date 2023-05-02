package Adapter;

import Adapter.NewFramework.CreditLeasing;

public class CreditAdapterClass extends CreditLeasing implements Credit {

	@Override
	public void oferaCredit(int suma) {
		super.oferaLeasing(suma);
		
	}

}
