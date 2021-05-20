package ro.ase.cts.factoryMethod;

public class Program { // Spital Pb 2
	
	public static void printeazaPersonalSpital(FactoryPersonal factoryPersonal, String nume, int salariu) {   // static ca sa fie functie si sa o putem apela din Main  
		PersonalSpital personal1 = factoryPersonal.createPersonal(nume, salariu);
		System.out.println(personal1.toString());
	}

	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryAnestezist(); // tipul de personal dorit
		printeazaPersonalSpital(factoryPersonal, "Ion", 2500);
	}

}
