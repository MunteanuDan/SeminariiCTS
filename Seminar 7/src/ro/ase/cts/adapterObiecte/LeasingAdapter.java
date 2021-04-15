package ro.ase.cts.adapterObiecte;

public class LeasingAdapter implements Creditable {
	private Leasing leasing;
	
	public LeasingAdapter(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit() {
		leasing.oferaLeasing();
	}
}
