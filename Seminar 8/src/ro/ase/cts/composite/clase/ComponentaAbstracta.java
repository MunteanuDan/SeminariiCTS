package ro.ase.cts.composite.clase;

public interface ComponentaAbstracta { // ar fi optiunile, dar i-am pus numele ComponentaAbstracta
				// daca adaugam atribute, atunci o faceam clasa abstracta
	public void afiseazaDescriere();
	
	public void addComponenta(ComponentaAbstracta componentaAbstracta) throws Exception;
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta);
	public ComponentaAbstracta getComponenta(int pozitie);
	
}
