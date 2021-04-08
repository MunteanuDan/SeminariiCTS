package ro.ase.cts.adapter.classes;

import ro.ase.cts.adapter.obiecte.Creditable;
import ro.ase.cts.adapter.obiecte.Leasing;

public class LeasingAdapterClase extends Leasing implements Creditable{

	public LeasingAdapterClase(String nume) {
		super(nume);
	}

	@Override
	public void oferaCredit() {
		super.oferaLeasing();
		
	}

}
