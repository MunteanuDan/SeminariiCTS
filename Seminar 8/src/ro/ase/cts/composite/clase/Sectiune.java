package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta{
	
	private String denumire;
	
	List<ComponentaAbstracta> optiuni;

	
	public Sectiune(String denumire) {
		super();
		this.denumire = denumire;
		optiuni = new ArrayList<>(); // doar am alocat spatiu pentru Sectiuni, vom adauga ulterior cu Add diferite componente  
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Sectiunea" + denumire);
		
		for(ComponentaAbstracta optiune : optiuni) {
			 //System.out.println(optiune.afiseazaDescriere();
			optiune.afiseazaDescriere(); // fara System.out.println pt ca e de tip void si trb doar sa apelez
		}
		
	}

	@Override
	public void addComponenta(ComponentaAbstracta componentaAbstracta) {
		optiuni.add(componentaAbstracta);
		
	}

	@Override
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
		optiuni.remove(componentaAbstracta);
		
	}

	@Override
	public ComponentaAbstracta getComponenta(int pozitie) {
			if(pozitie > 0 && pozitie < optiuni.size()) {
				return optiuni.get(pozitie);
			}
		return null;
	}
	
}
