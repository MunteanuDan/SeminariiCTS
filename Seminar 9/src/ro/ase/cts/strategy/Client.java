package ro.ase.cts.strategy;

public class Client {
	private String nume;
	private ModalitatePlata modPlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata = new Card(); // modalitatea de plata default este cea cu cardul
	}
	
	public void platesteNota(double suma) {
		System.out.println("Clientul " + this.nume + " are de platit nota!");
		modPlata.plateste(suma);
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setModPlata(ModalitatePlata modPlata) { // l am facut ca sa avem posibilitatea de a modifica ModalitatePlata la runtime   
		this.modPlata = modPlata;
	}
	
	
}
