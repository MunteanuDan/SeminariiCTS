package ro.ase.cts.observer;

import java.util.List;

public class ManagerSala extends ManagerSalaAbstract {

	public void anuntaMeciFotbal(String tipMeci) {
		super.trimiteNotificare("Incepe meciul de " + tipMeci);
	}
}
