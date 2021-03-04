package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader { // am creat aceasta clasa abstracta ca celelalte 3 clase sa mosteneasca aceasta clasa
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException; // am dat copy-paste, nu mai statica pt ca e metoda
	
}
