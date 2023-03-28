package ro.acs.ase.prototype.main;

import ro.acs.ase.prototype.AbstractPrototype;
import ro.acs.ase.prototype.Client;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		AbstractPrototype clientPrototye = new Client("Andrei", "0734934", "aaa@aa");

		AbstractPrototype client = clientPrototye.createCopy();

		System.out.println(client.toString());
	}

}
