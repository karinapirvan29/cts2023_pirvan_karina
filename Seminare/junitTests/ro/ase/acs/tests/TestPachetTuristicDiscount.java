package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Mods.FakePerson;
import ro.ase.acs.persoana.model.IPersoana;
import ro.ase.acs.persoana.model.PachetTuristic;
import ro.ase.acs.persoana.model.Persoana;

class TestPachetTuristicDiscount {

	@Test
	void shouldApplyDiscountSeniors() {
		FakePerson person=new FakePerson();
		person.setGetVarstaValue(67);
		person.setGetSexValue("M");
		
		PachetTuristic pachet=new PachetTuristic(person, "Bali", 1000.00);
		pachet.aplicaDiscountVarstnici(15);
		
		assertEquals(850, pachet.getPret());
	}
	
	@Test
	void shouldNotApplyDiscountSeniors() {
		FakePerson person=new FakePerson();
		person.setGetVarstaValue(50);
		person.setGetSexValue("M");
		
		PachetTuristic pachetT=new PachetTuristic(person, "France", 1000.00);
		pachetT.aplicaDiscountVarstnici(25);
		assertEquals(1000.00, pachetT.getPret());
		
	}

}
