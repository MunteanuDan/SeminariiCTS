package sem6.builderV2;

public class Main {

	public static void main(String[] args) {
		RezervareBuilder builder = new RezervareBuilder().setCodRezervare(1).setArebauturaRacoritoare(true);
		Rezervare rezervare = builder.build();
		builder.setCodRezervare(2).setAreMancareInclusa(true);
		Rezervare rezervare2 = builder.build();
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		RezervareBuilder builder2 = new RezervareBuilder().setAreScaunErgonomic(true).setCodRezervare(3);
		Rezervare rezervare3 = builder2.build();
		System.out.println(rezervare3.toString());
		
	}

}
