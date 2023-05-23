package ro.ase.acs.chain.classes;

public abstract class Notificare {
	
	private Notificare succesor;
	
	public abstract void trimiteNotificare(Client client, String mesaj);
	

	public Notificare(Notificare succesor) {
		super();
		this.succesor = succesor;
	}


	public Notificare getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Notificare succesor) {
		this.succesor = succesor;
	}

}
