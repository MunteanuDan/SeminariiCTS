package sem6.prototype;

public class Main {

	public static void main(String[] args) {
		ContClient client1 = new ContClient("Ion", 19); // ne am facut un ob de tip client
		ContClient client2 = (ContClient) client1.copiaza();
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
		
		
		Bilet bilet1 = new Bilet(0, "Arsenal", "Barcelona", "1 Aprilie","1");
		Bilet bilet2 = new Bilet(1, "Chelsea", "Porto", "2 Martie", "2");
		
		Bilet bilet3 = (Bilet)bilet1.copiaza();
		bilet3.setCodBilet(12);
		bilet3.setLoc("1F");
		
		Bilet bilet4 = (Bilet)bilet1.copiaza();
		bilet4.setCodBilet(13);
		bilet4.setLoc("2F");
		
		System.out.println(bilet3);
		System.out.println(bilet4);
		
	}

}
