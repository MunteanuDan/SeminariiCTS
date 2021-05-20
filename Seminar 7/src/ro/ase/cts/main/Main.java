package ro.ase.cts.main;

import ro.ase.cts.adapterClase.Creditable;
import ro.ase.cts.adapterClase.Leasing;
import ro.ase.cts.adapterClase.LeasingAdapter;

public class Main {

	public static void afiseazaInformatiiCredit(Creditable credit) { // de aceasta functie este reprezentata aplicatia noastra
		credit.oferaCredit();
	}
	public static void main(String[] args) {
		
//		Asta e pentru adapter-ul de obiecte:
//			
//		Leasing leasing = new Leasing("Andrei");
//		LeasingAdapter leasingAdapter = new LeasingAdapter(leasing);
//		afiseazaInformatiiCredit(leasingAdapter);
		
	// Asta e pentru adapter-ul de clase:	
	// Un avantaj este ca nu mai trb sa ne mai cream acel obiect intermediar
	// Nu o sa-l putem implementa pe cel de clase daca avem clasa abstracta in loc de interfata, deoarece nu vom putea face mostenire multipla 
		LeasingAdapter adapter = new LeasingAdapter("Mihai");
		afiseazaInformatiiCredit(adapter);
	}

}
