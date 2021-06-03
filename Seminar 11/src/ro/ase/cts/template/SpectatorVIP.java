package ro.ase.cts.template;

public class SpectatorVIP extends SpectatorAbstract{
	private String nume;

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume + " se prezinta direct la poarta");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume + " prezinta bilet VIP");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Lui " + nume + " i se face control corporal");
	}

	@Override
	public void intraPeStadion() {
		System.out.println(nume + " intra in loja");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume + " ocupa loc in loja");
	}

}
