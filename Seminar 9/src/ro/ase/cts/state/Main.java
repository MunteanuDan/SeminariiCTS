package ro.ase.cts.state;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(3);
		
		masa.elibereazaMasa();
		
		masa.rezervaMasa();
		masa.rezervaMasa();
		
		masa.ocupaMasa();
		masa.ocupaMasa();
	}

}

// aici nu mai folosim set spre deosebire de strategy