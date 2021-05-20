package ro.ase.cts.state;

public class Masa {
	private int nrMasa;
	private Stare stare;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera(); // starea default este libera
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof StareLibera) { // daca stare e instanta la StareLibera
			this.stare = new StareRezervata(); // masa devine rezervata
			System.out.println("Ati rezervat masa cu nr. " + this.nrMasa);
		} else {
			System.out.println("Masa " + this.nrMasa + " nu poate fi rezervata!"); // daca masa nu e libera 
		}
	}
	
	public void ocupaMasa() {
		if(this.stare instanceof StareLibera || this.stare instanceof StareRezervata) {
			this.stare = new StareOcupata(); // atunci ocupam masa
			System.out.println("Ati ocupat masa cu nr. " + this.nrMasa);
		} else {
			System.out.println("Masa " + this.nrMasa + " nu poate fi ocupata!");
		}
	}
	
	public void elibereazaMasa() {
		if(!(this.stare instanceof StareLibera)) { // daca masa nu e libera
			this.stare = new StareLibera(); // facem masa libera
			System.out.println("Masa cu nr. " + this.nrMasa + " este eliberata!");
		} else {
			System.out.println("Masa " + this.nrMasa + " este deja libera!");
		}
	}
}
