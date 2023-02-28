package cts.s02.principii_clean_code.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	
	public abstract List<Aplicant> readApplicants(String file) throws FileNotFoundException;
	
    public void readFromFile(Scanner input, Aplicant aplicant) {
    	
    	aplicant.setNume(input.next());
    	aplicant.setPrenume(input.next());
		aplicant.setVarsta(Integer.valueOf(input.nextInt()));
		aplicant.setPunctaj(Integer.valueOf(input.nextInt()));
		aplicant.setNr_proiecte(Integer.valueOf(input.nextInt()));
		String[] vect = new String[aplicant.getNr_proiecte()];
		for (int i = 0; i < vect.length; i++)
			vect[i] = input.next();
    }

}
