package ro.ase.cts.prototype;

public class Reteta implements RetetaMedicament{

	private String solutie;
	private int cantitate;
	
	public String getSolutie() {
		return solutie;
	}
	public int getCantitate() {
		return cantitate;
	}
	
	public Reteta() { // facem constructorul fara param ca sa nu ne folosim de Clonable
		super();
	}
	
	public Reteta(String solutie, int cantitate) {
		super();
		this.solutie = solutie;
		this.cantitate = cantitate;
	}
	
	@Override
	public String toString() {
		return "Reteta [solutie=" + solutie + ", cantitate=" + cantitate + "]";
	}
	@Override
	public RetetaMedicament copiaza() {
		Reteta reteta = new Reteta();
		reteta.solutie = this.solutie;
		reteta.cantitate = this.cantitate;
		return reteta;
	}
	
	
	
}
