package sem6.builder;

public class RezervareBuilder implements AbstractBuilder{
	
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		rezervare = new Rezervare(0, false, false, false, false, "rock");
	}

	@Override
	public Rezervare build() {
	
		return rezervare;
	}
	
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this; // this este de tipul RezervareBuilder
	}
	
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this; // this este de tipul RezervareBuilder
	}
	
	public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.rezervare.setArebauturaRacoritoare(areBauturaRacoritoare);
		return this; // this este de tipul RezervareBuilder
	}
	
	public RezervareBuilder setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzicaAmbientalaPersonalizata);
		return this; // this este de tipul RezervareBuilder
	}
	
	public RezervareBuilder setCodRezervare (int codRezervare ) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	
	}
	
}
