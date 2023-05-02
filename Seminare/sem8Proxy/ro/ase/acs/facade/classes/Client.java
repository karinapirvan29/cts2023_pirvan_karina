package ro.ase.acs.facade.classes;

public class Client {

	private String name;
	private String cnp;
	
	
	public Client(String name, String cnp) {
		super();
		this.name = name;
		this.cnp = cnp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	
	
}
