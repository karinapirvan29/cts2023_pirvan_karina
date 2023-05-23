package ro.ase.acs.chain.main;

import ro.ase.acs.chain.classes.Client;
import ro.ase.acs.chain.classes.EmailNotificator;
import ro.ase.acs.chain.classes.ManagerNotificator;
import ro.ase.acs.chain.classes.Notificare;
import ro.ase.acs.chain.classes.SMSNotificator;

public class Main {

	public static void main(String[] args) {
		
		Notificare sms = new SMSNotificator(null);
		Notificare email=new EmailNotificator(null);
		Notificare manager= new ManagerNotificator(null);
		
		sms.setSuccesor(email);
		email.setSuccesor(manager);
		
		Client client1=new Client("Gigi",null,"gigi@gmail.com");
		Client client2=new Client("maria","4758475435","maria@gmail.com");
		Client client3=new Client("jimmy","475683475",null);
		Client client4=new Client("protopopescu",null,null);
		
		sms.trimiteNotificare(client1, "mesaj");
		sms.trimiteNotificare(client3, "mesaj");
		sms.trimiteNotificare(client4, "mesaj");
		sms.trimiteNotificare(client2, "mesaj");
		
		
	}
}
