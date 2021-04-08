package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract{
	private CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	@Override
	public void realizeazaPlataOnline() {
		this.cardAbstract.realizeazaPlataOnline();
	}

	@Override
	public void realizeazaPlataNormala() {
		this.cardAbstract.realizeazaPlataNormala();
	}

	@Override
	public String getDetinator() {
		return this.cardAbstract.getDetinator();
	}
	
	public abstract void realizeazaPlataContactless();
}
