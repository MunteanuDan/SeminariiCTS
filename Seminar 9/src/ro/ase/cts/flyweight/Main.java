package ro.ase.cts.flyweight;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1, 4, "10:00");
		Rezervare rezervare2 = new Rezervare(2, 2, "12:00");
		Rezervare rezervare3 = new Rezervare(3, 5, "15:00");
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		flyweightFactory.getClient("0712498325").printeazaRezervare(rezervare1);
		flyweightFactory.getClient("0789462530").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("0761246583").printeazaRezervare(rezervare3);
	}

}
