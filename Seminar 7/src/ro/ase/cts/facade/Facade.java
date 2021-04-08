package ro.ase.cts.facade;

public class Facade {
	public static boolean verificaPersoana(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouCredite.areCreante(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
