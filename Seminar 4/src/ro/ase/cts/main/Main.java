package ro.ase.cts.main;

import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamentFinanciarEager1 = DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciarEager2 = DepartamentFinanciarEager.getInstance();
		
		System.out.println(primulDepartamentFinanciarEager1.toString());
		System.out.println(alDoileaDepartamentFinanciarEager2.toString());
		
		primulDepartamentFinanciarEager1.setDirector("Gigel");
		alDoileaDepartamentFinanciarEager2.setNrAngajati(20);
		
		System.out.println(primulDepartamentFinanciarEager1.toString());
		System.out.println(alDoileaDepartamentFinanciarEager2.toString()); // am in spate o singura instanta
		
		DepartamentFinanciar primulDepartamentFinanciar = DepartamentFinanciar.getInstance(20, "Popescu", 2500);
		DepartamentFinanciar alDoileaDepartamentFinanciar = DepartamentFinanciar.getInstance(30, "Avramescu", 2700);
		
		System.out.println(primulDepartamentFinanciar.toString()); 
		System.out.println(alDoileaDepartamentFinanciar.toString()); // afiseaza doar prima instanta
		
	}

}
