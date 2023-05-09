package ro.ase.acs.flyweight.classes;

public class Client implements IClient{
	
	private String nume;
	private String nrTelefon;
	private String adresaMail;
	

	public Client(String nume, String nrTelefon, String adresaMail) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaMail = adresaMail;
	}


	@Override
	public void afiseazaDetaliiRezervare(Rezervare rezervare) {
		System.out.println("Clientul: "+this.nume+", nr telef: "+this.nrTelefon
				+", adresa de mail: "+this.adresaMail+" a rezervat masa"+rezervare.getNrMasa()
				+" pentru "+rezervare.getNrPersoane()+" persoane la ora "+rezervare.getOra());
		
	}

}
