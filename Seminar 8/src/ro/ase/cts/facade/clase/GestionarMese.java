package ro.ase.cts.facade.clase;

public class GestionarMese {
	public boolean esteMasaLibera(int cod)
	{
		if(cod>=9)  // daca codul mesei este >= 9 atunci masa este libera
		{
			return true;
		}
		return false;
	}
}
