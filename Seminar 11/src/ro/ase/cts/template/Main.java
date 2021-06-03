package ro.ase.cts.template;

public class Main {

	public static void main(String[] args) {
		Spectator spectator = new Spectator("George");
		SpectatorAbstract spectator2 = new Spectator("Andrei");
		
		spectator.intrareSpectatorStadion();
		
		SpectatorVIP spectatorVIP = new SpectatorVIP("Alexandru");
		spectatorVIP.intrareSpectatorStadion();
	}

}
