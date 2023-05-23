package ro.ase.acs.chain.classes;

public class Client {
	
	private String name;
	private String nrTelef;
	private String mail;
	
	public Client(String name, String nrTelef, String mail) {
		super();
		this.name = name;
		this.nrTelef = nrTelef;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public String getNrTelef() {
		return nrTelef;
	}

	public String getMail() {
		return mail;
	}
	
	

}
