package ro.ase.cts.main;

import ro.ase.cts.adapterClase.Creditable;
import ro.ase.cts.adapterClase.Leasing;
import ro.ase.cts.adapterClase.LeasingAdapter;

public class Main {

	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	public static void main(String[] args) {
		LeasingAdapter adapter = new LeasingAdapter("Mihai");
		afiseazaInformatiiCredit(adapter);
	}

}
