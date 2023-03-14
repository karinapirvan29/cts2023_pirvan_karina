package singletome.ase.cts;

public class Papa {
	
     private String nume;
     private int nrAniFunctie;
     private int alCatelea;
     private static Papa papa=new Papa("Benedict",2,276);
     
     private Papa(String nume, int nrAniFunctie, int alCatelea) {
    	 this.nume=nume;
    	 this.nrAniFunctie=nrAniFunctie;
         this.alCatelea=alCatelea;	 
     }
   
     
	public String getAnme() {
		return nume;
	}
	public void setAnme(String anme) {
		this.nume = anme;
	}
	public int getNrAniFunctie() {
		return nrAniFunctie;
	}
	public void setNrAniFunctie(int nrAniFunctie) {
		this.nrAniFunctie = nrAniFunctie;
	}
	public int getAlCatelea() {
		return alCatelea;
	}
	public void setAlCatelea(int alCatelea) {
		this.alCatelea = alCatelea;
	}
     
	public static Papa getInstance() {
		return Papa.papa; //eager initialization -> a form of single tone
	}
     
}
