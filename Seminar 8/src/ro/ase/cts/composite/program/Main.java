package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		Sectiune sectiuneBauturi = new Sectiune("Bauturi");
		Sectiune sectiuneDesert = new Sectiune("Desert");
		Item itemFrappe = new Item("Frappe");
		Item itemCafea = new Item ("Cafea");
		Item itemEcler = new Item ("Ecler");
		
		sectiuneBauturi.addComponenta(itemCafea);
		sectiuneBauturi.addComponenta(itemFrappe); // doar aici, nu l gasim in 2 locuri ca sa fie si la desert
		
		sectiuneDesert.addComponenta(itemEcler);
		
		Sectiune meniu = new Sectiune("Meniu");
		meniu.addComponenta(sectiuneDesert);
		meniu.addComponenta(sectiuneBauturi);
		
		meniu.afiseazaDescriere();
		
		System.out.println();
		
		sectiuneBauturi.stergeComponenta(itemFrappe);
		sectiuneDesert.addComponenta(itemFrappe);
		
		meniu.afiseazaDescriere();
		
	}

}
