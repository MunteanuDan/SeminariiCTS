package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class GrupaTests {
	private Grupa grupa;
	
	@Before
	public void setUp(){
		grupa = new Grupa(1077);
		for(int i=0; i<10; i++) {
			Student student = new Student("Marcel");
			student.adaugaNota(5);
			student.adaugaNota(4);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
	}
	
	// TESTE PENTRU METODA GET PROMOVABILITATE
	
	@Test
	public void testGetPromovabilitate() {
		Student student = new Student("Marcel");
		student.adaugaNota(10);
		student.adaugaNota(10);
		
		Student studentMaria = new Student("Maria");
		studentMaria.adaugaNota(10);
		studentMaria.adaugaNota(10);
		
		grupa.adaugaStudent(studentMaria);
		grupa.adaugaStudent(student);
		
		assertEquals(0.16, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0,  grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupa = new Grupa(1077);
		
		for(int i=0; i<10; i++) {
			Student student = new Student("Ion");
			student.adaugaNota(5);
			student.adaugaNota(6);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1,  grupa.getPromovabilitate(), 0.05);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupaNoua = new Grupa(1032);
		grupaNoua.getPromovabilitate();
	}

	@Test(timeout = 500)
	public void testGetPromovabilitateTime() {
		grupa.getPromovabilitate();
	}

	// TESTE PENTRU CONSTRUCTORUL GRUPA

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMic() {
		int nrGrupa = 999;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa = 1299;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		int nrGrupa = 1077;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test
	public void testExistenceListaStudenti() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	

}
