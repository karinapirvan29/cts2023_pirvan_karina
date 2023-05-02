package ro.ase.acs.composite.main;

import ro.ase.acs.composite.classes.IComponentaAbstracta;
import ro.ase.acs.composite.classes.LocTribuna;
import ro.ase.acs.composite.classes.Tribuna;

public class Main {
	public static void main(String[] args) throws Exception {

		IComponentaAbstracta tribunaPrincipala=new Tribuna("Tribuna Principala");
		IComponentaAbstracta tribunaCopii=new Tribuna("Tribuna copii");
		IComponentaAbstracta tribunaAdulti=new Tribuna("Tribuna adulti");
		
		IComponentaAbstracta loc1=new LocTribuna(2,13);
		IComponentaAbstracta loc2=new LocTribuna(2,14);
		IComponentaAbstracta loc3=new LocTribuna(2,15);
		IComponentaAbstracta loc4=new LocTribuna(2,16);
		
		tribunaPrincipala.adaugaNode(tribunaCopii);
		tribunaCopii.adaugaNode(loc1);
		tribunaAdulti.adaugaNode(loc2);
		tribunaPrincipala.adaugaNode(loc3);
		
		tribunaPrincipala.afiseazaComponenta(" ");
	}
}
