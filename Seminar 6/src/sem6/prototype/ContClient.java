package sem6.prototype;

public class ContClient implements AbstractPrototype{
	private String nume;
	private int varsta;
	
	public ContClient(String nume, int varsta) { // constructorul va face validari pt atribute
		// realizam validari costisitoare
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	
	
	private ContClient() {
		// aici nu facem validari
		super();
	}



	@Override
	public String toString() {
		return "ContClient [nume=" + nume + ", varsta=" + varsta + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		ContClient client = new ContClient(); // ne cream o noua instanta
		client.nume = this.nume;
		client.varsta = this.varsta;
		return client;
	}
	
	
	
}
