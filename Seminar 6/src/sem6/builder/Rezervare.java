package sem6.builder;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean arebauturaRacoritoare;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzica;
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic,
			boolean arebauturaRacoritoare, boolean areMuzicaAmbientalaPersonalizata, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.arebauturaRacoritoare = arebauturaRacoritoare;
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	public void setArebauturaRacoritoare(boolean arebauturaRacoritoare) {
		this.arebauturaRacoritoare = arebauturaRacoritoare;
	}
	public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancareInclusa=" + areMancareInclusa
				+ ", areScaunErgonomic=" + areScaunErgonomic + ", arebauturaRacoritoare=" + arebauturaRacoritoare
				+ ", areMuzicaAmbientalaPersonalizata=" + areMuzicaAmbientalaPersonalizata + ", genMuzica=" + genMuzica
				+ "]";
	}
	
	
}
