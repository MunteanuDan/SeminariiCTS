package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory { // Daca avem relatie de Is a, atunci avem extends/implements, la Has a, NU AVEM!
								// Aici e relatie de Has a
	private Map<String, Flyweight> clienti;
	
	public FlyweightFactory() { // nu dam parametri deoarece cand ne cream fabrica nu dam deja clienti, fabrica se ocupa de acest lucru   
		this.clienti = new HashMap<>();
	}
	
	public Flyweight getClient(String nrTelefon) {
		Flyweight flyweight = clienti.get(nrTelefon); // avem un obiect flyweight pe care-l luam din clienti dupa nrTelefon
		if(flyweight == null) { // daca flyweight da null, vom crea un client nou
			flyweight = new Client("Gigel", nrTelefon, "gigel@gmail.com");
			clienti.put(nrTelefon, flyweight); // adaugam in hashMap dupa nrTelefon si flyweight
		}
		
		return flyweight;
	}
}
