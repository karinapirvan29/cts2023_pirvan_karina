package ro.ase.acs.chain.classes;

public class EmailNotificator extends Notificare{

	public EmailNotificator(Notificare succesor) {
		super(succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		if(client.getMail()!=null) {
			System.out.println("Clientul: "+client.getName()+", ai primit prin mail urmatorul mesaj: "+mesaj);
		}else if (super.getSuccesor()!=null){
			
			super.getSuccesor().trimiteNotificare(client, mesaj);
			
				
		}else {
			System.out.println("problema nu poate fi rezolvata");
		}
		
	}

}
