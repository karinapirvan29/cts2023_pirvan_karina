package ro.ase.acs.facade.classes;

public class Facade {

	public void permiteIntrare(Client client, Bilet bilet) {
		Politie pol=new Politie();
		
		if(client.getName().equals(bilet.getClientName())) {
			if(!(pol.areCazier(client.getCnp()))){
				System.out.println("Clientul: "+client.getName()+" intra in stadion");
			}else {
				System.out.println("Clientul: "+client.getName()+" are cazier");
			}
		}else {
			System.out.println("Biletul este al altcuiva");
		}
	}
}
