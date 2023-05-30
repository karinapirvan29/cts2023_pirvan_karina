package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.acs.persoana.model.NotBarnedYet;
import ro.ase.acs.persoana.model.Persoana;

class PersoanaTests {

	@Test
	void testGetVarsta() {
		Persoana persoana = new Persoana("Maria", "6010911430027" );
		assertEquals(21, persoana.getVarsta());
	}

	@Test
	void testGetVarstaError() {
		Persoana persoana=new Persoana("Costel","6230524561327");
		assertThrows(NotBarnedYet.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				persoana.getVarsta();
				
			}
			
		});
	}
}
