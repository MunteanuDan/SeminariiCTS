package ro.ase.cts.strategy;

public class Cash implements ModalitatePlata {

	@Override
	public void plateste(double suma) {
		System.out.println("Clientul plateste " + suma + " cash");
	}

}
