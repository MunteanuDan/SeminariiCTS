package ro.ase.cts.simpleFactory;

public class FactoryPersonal {
	public static PersonalSpital createPersonal(TipPersonal tip, String nume, int salariu) throws Exception {
		switch (tip) {
		case Medic:
		{	return new Medic(nume, salariu); // instantiem si returnam Medic
			 
		}
		case Asistent:
			{
				return new Medic(nume, salariu);
				
			}
		case Brancardier:
			{
				return new Medic(nume, salariu); // nu ne trb break deoarece avem return
			}
		default: throw new Exception();
		}
	}
}
