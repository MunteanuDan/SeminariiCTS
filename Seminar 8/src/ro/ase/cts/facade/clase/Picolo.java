package ro.ase.cts.facade.clase;

public class Picolo { // aici nu am facut functii statice deoarece e posibil sa avem mai multi Picolo care se ocupa de mai multe mese    

	public boolean esteMasaDebarasata(int cod)
	{
		if(cod%4==0) 
		{
			return true;
		}
		return false;
	}
	
	public boolean areMasaServetele(int cod)
	{
		if(cod%3==0)
		{
			return true;
		}
		return false;
	}
	
}
