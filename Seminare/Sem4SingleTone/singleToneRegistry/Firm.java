package singleToneRegistry;

import java.util.HashMap;
import java.util.Map;

public class Firm {

	private String name;
	private int fiscalValue;
	private int empNumber;
	
	private static Map<String, Firm> firms=new HashMap<String, Firm>();

	private Firm(String name, int fiscalValue, int empNumber) {
		super();
		this.name = name;
		this.fiscalValue = fiscalValue;
		this.empNumber = empNumber;
	}
	
	public void angajare() {
		this.empNumber+=1;
	}
	
	
	
	@Override
	public String toString() {
		return "Firm [name=" + name + ", fiscalValue=" + fiscalValue + ", empNumber=" + empNumber + "]";
	}

	public synchronized static Firm getFirm(String firmName) {
		if(!(firms.containsKey(firmName))) {
			Firm firm=new Firm(firmName,0,0);
			firms.put(firmName,firm);
		}
		return firms.get(firmName);
	}
}
