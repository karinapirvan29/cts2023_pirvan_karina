package ro.ase.acs.observer.classes;

public class Client implements IClient{
	
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public void primNotif(String mesaj) {
		System.out.println(this.nume+"! Ati primit urmatoarea notificare: "+mesaj);
		
	}
	
	

}
