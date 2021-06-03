package ro.ase.cts.observer;

public class ClientAbonat implements Observer{
	// ESTE OBSERVER-UL CONCRET
	private String nume;

	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(nume + " a primit mesajul: " + mesaj);
	}
	
	

}
