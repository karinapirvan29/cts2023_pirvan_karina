package ro.ase.acs.composite.classes;

public class LocTribuna implements IComponentaAbstracta{
	
	private int rand;
	private int numarLoc;

	public LocTribuna(int rand, int loc) {
		this.rand=rand;
		this.numarLoc=loc;
	}

	@Override
	public void adaugaNode(IComponentaAbstracta componentaAbstracta)throws Exception {
		throw new Exception("Not yet implemented");
		
	}

	@Override
	public void stergeNode(IComponentaAbstracta componentaAbstracta) throws Exception{
		throw new Exception("Not yet implemented");
		
	}

	@Override
	public IComponentaAbstracta getNodeCopil(int index) throws Exception {
		throw new Exception("Not yet implemented");
	}

	@Override
	public void afiseazaComponenta(String identare)  {
		System.out.println(identare+ " Loc: rand: "+this.rand+", numar: "+this.numarLoc);
		
	}

}
