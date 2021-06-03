package ro.ase.cts.observer;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ClientAbonat c1 = new ClientAbonat("George");
		ClientAbonat c2 = new ClientAbonat("Andrei");
		ClientAbonat c3 = new ClientAbonat("Mircea");
		ClientAbonat c4 = new ClientAbonat("Danut");
		
		ManagerSala manager = new ManagerSala();
		
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		manager.adaugaAbonat(c4);
		
		manager.anuntaMeciFotbal("Fotbal");
	}
}
