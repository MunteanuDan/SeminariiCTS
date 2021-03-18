package ro.ase.cts.main;

import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;
import ro.ase.cts.clase.MeDalii;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamentFinanciarEager1 = DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciarEager2 = DepartamentFinanciarEager.getInstance();
		
		System.out.println(primulDepartamentFinanciarEager1.toString());
		System.out.println(alDoileaDepartamentFinanciarEager2.toString());
		
		primulDepartamentFinanciarEager1.setDirector("Gigel");
		alDoileaDepartamentFinanciarEager2.setNrAngajati(20);
		
		System.out.println(primulDepartamentFinanciarEager1.toString());
		System.out.println(alDoileaDepartamentFinanciarEager2.toString()); 
		
		DepartamentFinanciar primulDepartamentFinanciar = DepartamentFinanciar.getInstance(20, "Popescu", 2500);
		DepartamentFinanciar alDoileaDepartamentFinanciar = DepartamentFinanciar.getInstance(30, "Avramescu", 2700);
		
		System.out.println(primulDepartamentFinanciar.toString()); 
		System.out.println(alDoileaDepartamentFinanciar.toString()); 
		
		MeDalii medalii1 = MeDalii.getInstance(1, "argint", 30);
		MeDalii medalii2 = MeDalii.getInstance(1, "aur", 40);
		
		System.out.println(medalii1.toString()); 
		System.out.println(medalii2.toString());
		
	}

}
