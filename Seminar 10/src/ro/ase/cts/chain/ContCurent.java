package ro.ase.cts.chain;

public class ContCurent extends Handler{

	public ContCurent(float sold) {
		super(sold);
	
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			System.out.println("S-a realizat plata cu suma de "+suma+ " din contul curent");
			// ca sa modificam sold-ul:
			float soldActual = super.getSold(); // facem soldul actual
			soldActual = soldActual - suma;
			super.setSold(soldActual); // super.setSold este apelul 
			// sau:
			// super.setSold(super.getSold() - suma); // asta-i varianta a doua
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}
	
}
