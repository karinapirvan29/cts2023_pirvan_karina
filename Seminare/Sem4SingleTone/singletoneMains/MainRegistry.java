package singletoneMains;

import singleToneRegistry.Firm;

public class MainRegistry {
public static void main(String[] args) {
	
	Firm firm = Firm.getFirm("SC ceva SRL");
	Firm firm2 = Firm.getFirm("SC ceva SRL");
	Firm firm3 = Firm.getFirm("SC altceva SRL");
	
	firm.angajare();
	firm2.angajare();
	firm3.angajare();
	
	System.out.println(firm);
	System.out.println(firm2);
	System.out.println(firm3);
	
}
}
