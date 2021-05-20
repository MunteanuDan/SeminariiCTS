package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.GestionarMese;
import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.Picolo;

public class Main {

	public static void main(String[] args) {
		
//		GestionarMese gestionar = new GestionarMese();
//		Picolo picolo = new Picolo();
//		//Masa masa = new Masa(4, 4);
//		Masa masa = new Masa(12, 4);
//		
//		if(gestionar.esteMasaLibera(masa.getCod())) 
//		{
//			if(picolo.esteMasaDebarasata(masa.getCod()))
//			{
//				if(picolo.areMasaServetele(masa.getCod()))
//				{
//					System.out.println("Poftiti la masa cu codul " + masa.getCod());
//				}
//				else System.out.println("Mai asteptati");
//			}
//			else System.out.println("Mai asteptati");
//		}
//		else System.out.println("Mai asteptati");
		
		
		// De aici e Facade
		Masa masa = new Masa(5,10);
		if(Facade.potAsezaLaMasa(masa))
		{
			System.out.println("Poftiti la masa");
		}
		else
		{
			System.out.println("Mai asteptati");
		}
		
	}

}
