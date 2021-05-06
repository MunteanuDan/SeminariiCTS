package ro.ase.cts.clase;

public class ComandaDepunere extends Comanda{

	public ComandaDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.contBancar.depunere(super.suma);
	}

}
