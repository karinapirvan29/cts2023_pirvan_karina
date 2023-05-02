package ro.ase.acs.peoxy.classes;

public class TicketOffice implements ITichetOffice{

	@Override
	public void sellTichet(Client client) {
		System.out.println("Ticket was sold to: "+client.getClientName());
		
	}

}
