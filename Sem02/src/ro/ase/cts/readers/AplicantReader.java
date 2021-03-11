package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader { // am creat aceasta clasa abstracta ca celelalte 3 clase sa mosteneasca aceasta clasa
	protected String numeFisier; // l am facut protected pt ca il folosim in cls fiu, iar motivul e sa nu mai facem getter
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException; // am dat copy-paste, nu mai e statica pt ca e metoda
	
	public AplicantReader(String nume) {
		numeFisier = nume;
	}
	
	protected void readAplicant(Scanner input, Aplicant aplicant) { // protected deoarece va fi apelata doar din clasele fiu
													 // Dam scanner ca param, in scanner avem deja fisierul citit
		String nume = input.next();
		String prenume = (input.next()).toString();
		int varsta = Integer.valueOf(input.nextInt());
		int punctaj = Integer.valueOf(input.nextInt());
		int nr = Integer.valueOf(input.nextInt());
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(nr, vect);		
		
	}
	
	
} // am creat cls pt a avea toate readerele
