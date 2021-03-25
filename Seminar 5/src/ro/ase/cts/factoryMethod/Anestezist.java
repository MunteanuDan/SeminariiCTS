package ro.ase.cts.factoryMethod;

public class Anestezist extends PersonalSpital {

	public Anestezist(String name, int salariu) {
		super(name, salariu);
	}

	@Override
	public String toString() {
		return "Anestezist [getName()=" + getName() + ", getSalariu()=" + getSalariu() + "]";
	}
}
