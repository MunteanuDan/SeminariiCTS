package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {
	
	//Student student = new Student();
	Student student = null;
	
	@Before
	public void setUp() {
		student = new Student();
	}
	

	@Test
	public void testApelCorectConstructorCuParametru() {
		String nume = "Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume()); // daca cele 2 sunt diferite va apela fail, iar testul pica
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume = "Student";
		Student student = new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorFaraParametru() {
		//Student student = new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
	//	Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0)); // getNota(0) - nota de pe pozitia 0
	}
	
	@Test
	public void testMarimeListaCorecta() {
	//	Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
	//	Student student = new Student();
		String nume = "Popescu";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testareCalculMedie() {
		student.adaugaNota(7);
		student.adaugaNota(8);
		assertEquals(7.5, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMediePentruOSinguraNota() {
		int nota = 9;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testVerificareRestante() {
		int nota = 4;
		int nota1 = 10;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareNuAreRestante() {
		int nota = 5;
		int nota1 = 10;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificareAruncareExceptie() {
		int index = -1;
		student.getNota(index);
		
	}
	
	@Test
	public void testgetNotaShouldThrowException() {
		Student s = new Student();
		// 1
		try {
			// 2
			s.getNota(-1);
			fail("nu trebuia sa ajunga aici");
		}catch(IndexOutOfBoundsException err) {
			// 4
		}
		   // 5
		
	}
	

}
