package ro.ase.cts.simpleFactory;

public class FactoryPersonal {
	public static PersonalSpital createPersonal(TipPersonal tip, String nume, int salariu) throws Exception { // nume si salariu aici sunt parametri  
		switch (tip) {
		case Medic:
		{	return new Medic(nume, salariu); // instantiem si returnam Medic
			 
		} // { } este un corp
		case Asistent:
			{
				return new Medic(nume, salariu);
				// break;
			} // nu punem break-ul deoarece avem deja return si nu mai este nevoie
		case Brancardier:
			{
				return new Medic(nume, salariu); // nu ne trb break deoarece avem return
			}
		default: throw new Exception();
		}
	}
}
