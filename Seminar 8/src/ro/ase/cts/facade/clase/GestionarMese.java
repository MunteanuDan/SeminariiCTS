package ro.ase.cts.facade.clase;

public class GestionarMese {
	public boolean esteMasaLibera(int cod)
	{
		if(cod>=9) 
		{
			return true;
		}
		return false;
	}
}
