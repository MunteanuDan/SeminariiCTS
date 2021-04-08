package ro.ase.cts.adapter.obiecte;

import ro.ase.cts.adapter.classes.LeasingAdapterClase;

public class Program {
	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	
	public static void main(String[] args) {
		// adapter de obiecte
		Leasing leasing  = new Leasing("Popescu");
		LeasingAdapter adapter = new LeasingAdapter(leasing);
		afiseazaInformatiiCredit(adapter);

		// adapter de clase
		LeasingAdapterClase leasingAdapterClase = new LeasingAdapterClase("Popescu");
		afiseazaInformatiiCredit(leasingAdapterClase);
	}

}
