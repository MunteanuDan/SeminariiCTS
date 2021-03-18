package ro.ase.cts.clase;

public class MeDalii {
	private int nrMedalii;
	private String tipMedalii;
	private double greutateMedalii;
	
private static MeDalii medalii = null; 
	
	private MeDalii(int nrMedalii, String tipMedalii, double greutateMedalii) {
		this.nrMedalii = nrMedalii;
		this.tipMedalii = tipMedalii;
		this.greutateMedalii = greutateMedalii;
	}
	
	public static synchronized MeDalii getInstance(int nrMedalii, String tipMedalii, double greutateMedalii) { 
		if(medalii == null) { 
			medalii = new MeDalii(nrMedalii, tipMedalii, greutateMedalii);
		}
		return medalii;
	}

	public void setNrMedalii(int nrMedalii) {
		this.nrMedalii = nrMedalii;
	}

	public void setTipMedalii(String tipMedalii) {
		this.tipMedalii = tipMedalii;
	}

	public void setGreutateMedalii(double greutateMedalii) {
		this.greutateMedalii = greutateMedalii;
	}

	@Override
	public String toString() {
		return "MeDalii [nrMedalii=" + nrMedalii + ", tipMedalii=" + tipMedalii + ", greutateMedalii=" + greutateMedalii + "]";
	}
	
	
	
	
}
