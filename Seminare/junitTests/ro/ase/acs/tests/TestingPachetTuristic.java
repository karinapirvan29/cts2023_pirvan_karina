package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Mods.StubPerson;
import Mods.StubPersonMinor;
import ro.ase.acs.persoana.model.IPersoana;
import ro.ase.acs.persoana.model.PachetTuristic;
import ro.ase.acs.persoana.model.Persoana;

class TestingPachetTuristic {

	@Test
	void PoateRezerva() {
		//daca pers are 18 ani=> test passed
		IPersoana persoana=new StubPerson();
		PachetTuristic turist=new PachetTuristic(persoana, "destinatie", 20.25);
		
		assertTrue(turist.poateRezerva());
		
	}

	@Test
	void testMinorFaraRezervare() {
		//daca pers e minora (sub 18) => test fail
		IPersoana persoana=new StubPersonMinor();
		PachetTuristic turist=new PachetTuristic(persoana, "destinatie", 20.25);
		
		assertFalse(turist.poateRezerva());
	}
	
	private List<Object> getList(){
		List<Object> list=new ArrayList<Object>();
		list.add(new Integer(5));
		return list;
	}
	
	
	
	
//	private List<Object> getListNull(){
//	 return null;
//	}
//	
//	private int getVal() {
//		return 10;
//	}
//	
//	private boolean getBool() {
//		return true;
//	}
//	
//	@Test
//	public void testDemonstrativ(){
//		assertEquals(true, getBool());
//		assertEquals(10, getVal());
//		assertTrue(getBool());
//		assertFalse(!getBool());
//		
//		assertNotNull(getList());
//		assertNull(getListNull());
//	}
	
	
}
