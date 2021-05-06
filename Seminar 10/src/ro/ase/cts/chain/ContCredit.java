package ro.ase.cts.chain;

public class ContCredit extends Handler{

	public ContCredit(float sold) {
		super(sold);
	
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			System.out.println("S-a realizat plata cu suma de "+suma+ " din contul curent");
			 super.setSold(super.getSold() - suma); // asta-i varianta a doua
					}
					else {
						super.getSuccesor().realizeazaPlata(suma);
					}
	}
	
}
