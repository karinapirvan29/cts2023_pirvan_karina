package ro.ase.acs.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Tribuna implements IComponentaAbstracta{
	
	private String nume;
	private List<IComponentaAbstracta> listaComponenete;
	
	

	public Tribuna(String nume) {
		this.nume = nume;
		listaComponenete=new ArrayList<>();
	}

	@Override
	public void adaugaNode(IComponentaAbstracta componentaAbstracta) throws Exception {
		listaComponenete.add(componentaAbstracta);
		
	}

	@Override
	public void stergeNode(IComponentaAbstracta componentaAbstracta) throws Exception {
		listaComponenete.remove(componentaAbstracta);
		
	}

	@Override
	public IComponentaAbstracta getNodeCopil(int index) throws Exception {
		return listaComponenete.get(index);
	}

	@Override
	public void afiseazaComponenta(String indentare) {
		System.out.println(indentare+ " Tribuna: "+this.nume+ " contains");
		for(IComponentaAbstracta c: listaComponenete) {
			c.afiseazaComponenta(indentare+"   ");
		}
		
	}

}
