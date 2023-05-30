package ro.ase.acs.persoana.model;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {

	private List<IPachet> pacheteTuristice;
	
	public AgentieTurism() {
		pacheteTuristice=new ArrayList<IPachet>();
	}
	
	public void adaugaPachet(IPachet pachet) {
		pacheteTuristice.add(pachet);
	}
	
	public double calculareSumaTotalaPachete() {
		double suma=0;
		for(IPachet pachet:pacheteTuristice) {
			suma+=pachet.getPret();
		}
		
		return suma;
	}
}
