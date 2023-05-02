package ro.ase.acs.peoxy.classes;

public class Client {

	private int age;
	private String clientName;
	
	public Client(int age, String clientName) {
		super();
		this.age = age;
		this.clientName = clientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	
}
