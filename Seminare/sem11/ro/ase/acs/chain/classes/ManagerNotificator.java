package ro.ase.acs.chain.classes;

public class ManagerNotificator extends Notificare{

	public ManagerNotificator(Notificare succesor) {
		super(succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		System.out.println("Manager, nu avem date de contact pentru "+client.getName());
		
	}

}
