package ro.ase.cts.facade;

public class Politie {
	public static boolean esteUrmaritDePolitie(Persoana persoana) {
		if((Integer.parseInt(""+persoana.getCnp().charAt(12))) % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
