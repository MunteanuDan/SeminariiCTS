package ro.ase.cts.facade;

public class Politie {
	public static boolean esteUrmaritDePolitie(Persoana persoana) {
		if((Integer.parseInt(""+persoana.getCnp().charAt(12))) % 2 == 0) {
			return true; // am facut in functie de CNP daca e urmarit de politie in functie de ultima cifra    
		} else {
			return false;
		}
	}
}
