package AdapterObject;

import Adapter.Credit;
import Adapter.NewFramework.CreditLeasing;

public class CreditAdapterObject implements Credit{

	
	private CreditLeasing credit;
	
	public CreditAdapterObject(CreditLeasing credit) {

		this.credit= credit;
}
	
	@Override
	public void oferaCredit(int suma) {
		
		System.out.println("Credit Adapter Object: " + suma);
	}

}
