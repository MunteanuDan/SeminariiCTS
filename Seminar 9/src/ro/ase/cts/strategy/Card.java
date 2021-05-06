package ro.ase.cts.strategy;

public class Card implements ModalitatePlata {

	@Override
	public void plateste(double suma) {
		System.out.println("Clientul plateste " + suma + " cu cardul");
	}

}
