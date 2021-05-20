package ro.ase.cts.adapterObiecte;

public class LeasingAdapter implements Creditable {
	private Leasing leasing; // instanta a leasing-ului
	
	public LeasingAdapter(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit() {
		leasing.oferaLeasing();
	}
}
// adapter-ul nu adauga functionalitati, ci le foloseste pe cele existente 
