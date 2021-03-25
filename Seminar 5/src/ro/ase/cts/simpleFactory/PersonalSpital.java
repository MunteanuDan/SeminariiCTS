package ro.ase.cts.simpleFactory;

public abstract class PersonalSpital {
	private String nume;
	private int salariu;
	
	public PersonalSpital(String nume, int salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}
	public String getNume() {
		return nume;
	}
	public int getSalariu() {
		return salariu;
	}
	
	
}
