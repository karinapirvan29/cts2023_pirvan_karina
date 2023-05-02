package ro.ase.acs.composite.classes;

public interface IComponentaAbstracta {

	public void adaugaNode(IComponentaAbstracta componentaAbstracta)throws Exception;
	public void stergeNode(IComponentaAbstracta componentaAbstracta)throws Exception;
	public IComponentaAbstracta getNodeCopil(int index) throws Exception;
	public void afiseazaComponenta(String indentare);
}
