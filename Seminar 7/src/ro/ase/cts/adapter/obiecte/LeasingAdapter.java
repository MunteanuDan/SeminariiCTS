package ro.ase.cts.adapter.obiecte;

public class LeasingAdapter implements Creditable {
	private Leasing leasing; // instanta pt leasing
	@Override
	public void oferaCredit() {
		this.leasing.oferaLeasing();
	}
	public LeasingAdapter(Leasing leasing) {
		super();
		this.leasing = leasing;
	}
	
	
}
