package ro.ase.acs.command.classes;

public class CommandPlecareCursa implements ICommand{

	private int nrLinie;
	private Automobil automobil;
	
	public CommandPlecareCursa(int nrLinie, Automobil automobil) {
		super();
		this.nrLinie = nrLinie;
		this.automobil = automobil;
	}

	@Override
	public void execute() {
	
		automobil.plecareInCursa(nrLinie);
	}
	
}
