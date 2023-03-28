package ro.acs.ase.prototype;

public class Client implements AbstractPrototype {
	
	private String name;
	private String phoneNumber;
	private String email;
	
	

	public Client(String name, String phoneNumber, String email) {
		if(name.length() >= 3) {
			this.name = name;
		}
		else {
			throw new IllegalArgumentException();
		}
		
		this.phoneNumber = phoneNumber;
		
		if (email.contains("@")){
			this.email = email;
		}
		else {
			throw new IllegalArgumentException();
		}
	}


	@Override
	public AbstractPrototype createCopy() throws CloneNotSupportedException {
		return (AbstractPrototype) this.clone();
	}
	
	
	private Client() {
		
	}
	
	public AbstractPrototype createDeepCopy() {
		Client client = new Client();
		client.name = this.name;
		client.email = this.email;
		client.phoneNumber = this.phoneNumber;
		return (AbstractPrototype)client;
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [name=");
		builder.append(name);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
