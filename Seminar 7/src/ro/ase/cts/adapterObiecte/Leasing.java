package ro.ase.cts.adapterObiecte;

public class Leasing {

	private String nume;
	
	public void oferaLeasing() {
		System.out.println("I se ofera un leasing lui: " + nume);
	}

	public Leasing(String nume) {
		super();
		this.nume = nume;
	}
	
}
