package singletoneRegistryGresit;

public class Firm {
private String name;
private int empNumber;

protected Firm(String name, int empNumber) {
	this.name=name;
	this.empNumber=empNumber;
}

@Override
public String toString() {
	return "Firm [name=" + name + ", empNumber=" + empNumber + "]";
}


}
