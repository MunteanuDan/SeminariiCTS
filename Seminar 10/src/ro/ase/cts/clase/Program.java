package ro.ase.cts.clase;

public class Program {

	public static void main(String[] args) {
		
		ManagerComenzi managerComenzi = new ManagerComenzi();
		ContBancar contBancar = new ContBancar("Dan", 0);
		managerComenzi.invoca(new ComandaConstituire(contBancar, 1000));
		managerComenzi.invoca(new ComandaConstituire(contBancar, 200));
		
		managerComenzi.invoca(new ComandaRetragere(contBancar, 500));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();

	}

}
