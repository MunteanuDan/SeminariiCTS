package ro.ase.cts.adapter.obiecte;

public class Leasing {
	String nume;
	public void oferaLeasing() // avem nume deja ca atribut, nu l mai trimitem ca param
	{
		System.out.println("I se ofera un leasing lui " + nume);
	}
	public Leasing(String nume) {
		super();
		this.nume = nume;
	}
	
}
