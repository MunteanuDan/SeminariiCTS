package ro.ase.cts.adapterObiecte;

public class Leasing {

	private String nume;
	
	public void oferaLeasing() { // oferaLeasing() e clasa si punem {}, daca era interfata puneam direct ;  
		System.out.println("I se ofera un leasing lui: " + nume);
	}

	public Leasing(String nume) {
		super();
		this.nume = nume;
	}
	
}
