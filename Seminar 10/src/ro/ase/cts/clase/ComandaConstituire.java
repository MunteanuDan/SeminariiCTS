package ro.ase.cts.clase;

public class ComandaConstituire extends Comanda {

	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

	@Override
	public void executa() {
		
		super.contBancar.constituire(super.suma);
	}

}
