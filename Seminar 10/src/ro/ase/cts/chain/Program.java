package ro.ase.cts.chain;

public class Program {

	public static void main (String[] args) {
		Handler contCredit = new ContCredit(5000);
		Handler contCurent = new ContCurent(2000);
		Handler contEconomii = new ContEconomii(2100);
		Handler refuzaTranzactia = new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		contCurent.realizeazaPlata(2050);
		
		
	}
	
}
