package ro.ase.acs.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDateClienti {
	
	private Map<String,IClient> clienti;
	
	public BazaDeDateClienti() {
		clienti=new HashMap<>();
	}
	
	public IClient getClient(String nume, String nrTelef, String adresaMail) { //pt a nu hardcode
		if(clienti.containsKey(nrTelef)) {
			return clienti.get(nrTelef);
		}else {
			IClient client=new Client(nume,nrTelef,adresaMail);
			clienti.put(nrTelef, client);
			return client;
		}
	}

}
