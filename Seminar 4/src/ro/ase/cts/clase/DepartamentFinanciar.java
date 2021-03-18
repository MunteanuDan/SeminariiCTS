package ro.ase.cts.clase;

public class DepartamentFinanciar {
	private int nrAngajati;
	private String director;
	private double salariulDeBaza;
	
private static DepartamentFinanciar departamentFinanciar = null; 
	
	private DepartamentFinanciar(int nrAngajati, String director, double salariulDeBaza) {
		this.director = director;
		this.nrAngajati = nrAngajati;
		this.salariulDeBaza = salariulDeBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAngajati, String director, double salariuBaza) { // synchronized ca sa fie thread safe
		if(departamentFinanciar == null) { // verific daca instanta mea este null si apelez constructorul
											// intra doar o data in acest IF, a doua oara nu va mai intra, de aceea ne afiseaza aceeasi prima instanta de 2 ori
			departamentFinanciar = new DepartamentFinanciar(nrAngajati, director, salariuBaza);
		}
		return departamentFinanciar;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariulDeBaza(double salariulDeBaza) {
		this.salariulDeBaza = salariulDeBaza;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", director=" + director + ", salariulDeBaza="
				+ salariulDeBaza + "]";
	}
	
	
	
}
