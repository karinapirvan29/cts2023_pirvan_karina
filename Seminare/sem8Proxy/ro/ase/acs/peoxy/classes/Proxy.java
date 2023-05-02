package ro.ase.acs.peoxy.classes;

public class Proxy implements ITichetOffice{

	private ITichetOffice office;
	
	public Proxy(ITichetOffice office2) {
		this.office=office2;
	}

	@Override
	public void sellTichet(Client client) {
		if(client.getAge()>=15) {
			office.sellTichet(client);
		}else {
			System.out.println("Client "+client.getClientName()+" is too young to buy tickets");
		}
	}

}
