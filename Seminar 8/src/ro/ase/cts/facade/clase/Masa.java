package ro.ase.cts.facade.clase;

public class Masa {

	private int cod;
	private int numarMaximPersoane;
	
	public Masa(int cod, int numarMaximPersoane) {
		super();
		this.cod = cod;
		this.numarMaximPersoane = numarMaximPersoane;
	}
	
	public int getCod() {
		return cod;
	}
	public int getNumarMaximPersoane() {
		return numarMaximPersoane;
	}

	@Override
	public String toString() {
		return "Masa [cod=" + cod + ", numarMaximPersoane=" + numarMaximPersoane + "]";
	}
	
	
	
	
}
