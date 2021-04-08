package ro.ase.cts.adapterClase;

public class LeasingAdapter extends Leasing implements Creditable {
	
	public LeasingAdapter(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.oferaLeasing();
	}
}
