package ro.ase.cts.flyweight;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1, 4, "10:00");
		Rezervare rezervare2 = new Rezervare(2, 2, "12:00");
		Rezervare rezervare3 = new Rezervare(3, 5, "15:00");
		
		FlyweightFactory flyweightFactory = new FlyweightFactory(); // ne folosim de fabrica noastra sa ne creeze clienti, nu o facem direct din Client 
		flyweightFactory.getClient("0712498325").printeazaRezervare(rezervare1);
		flyweightFactory.getClient("0712498325").printeazaRezervare(rezervare2); // le va afisa pe amandoua insa in memorie ramane doar una, clientul fiind
																			// deja existent in memorie, astfel economisim memorie
		flyweightFactory.getClient("0789462530").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("0761246583").printeazaRezervare(rezervare3);
	}

}
