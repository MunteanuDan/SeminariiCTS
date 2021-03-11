package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends AplicantReader {
	public StudentReader(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
		Scanner input2 = new Scanner(new File(super.numeFisier));
		input2.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Student student = new Student();
			super.readAplicant(input2, student);
			int an_studii = input2.nextInt();
			String facultate = (input2.next()).toString();
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		input2.close();
		return studenti;
	}
}
