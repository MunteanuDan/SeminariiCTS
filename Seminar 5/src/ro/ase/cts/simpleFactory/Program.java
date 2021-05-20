package ro.ase.cts.simpleFactory;

public class Program {
	public static void main(String[] args) {
		
	
		try {
	//		FactoryPersonal factory = new FactoryPersonal(); // ce este comentat era prima varianta, inainte sa facem functiile statice
			
			PersonalSpital personal1; // PersonalSpital il vom folosi mai jos ca reference type, nu le putem instanta deoarece sunt abstract      
			PersonalSpital personal2;
//			personal1 = factory.createPersonal(TipPersonal.Medic, "Ion", 1500);
//			personal2 = factory.createPersonal(TipPersonal.Asistent, "Maria", 1200);
			personal1 = FactoryPersonal.createPersonal(TipPersonal.Medic, "Ion", 1500); // am putut apea direct prin numele clasei deoarece este functie statica   
			personal2 = FactoryPersonal.createPersonal(TipPersonal.Asistent, "Maria", 1200);
			System.out.println(personal1);
			System.out.println(personal2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
