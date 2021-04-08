package ro.ase.cts.facade;

public class BirouCredite {
	public static boolean areCreante(Persoana persoana) {
		if((Integer.parseInt(""+persoana.getCnp().charAt(9))) % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
