package ro.ase.cts.strategy;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Georgel");
		
		client.setModPlata(new Card());
		client.platesteNota(1200);
		
		client.setModPlata(new Cash());
		client.platesteNota(1200);
	}

}
