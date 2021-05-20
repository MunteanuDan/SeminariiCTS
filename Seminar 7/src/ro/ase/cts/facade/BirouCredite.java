package ro.ase.cts.facade;

public class BirouCredite {
	public static boolean areCreante(Persoana persoana) {
		if((Integer.parseInt(""+persoana.getCnp().charAt(9))) % 2 == 0) {
			return true; // daca pe pozitia 9 din CNP da true atunci are creante
		} else {
			return false;
		}
	}
}
