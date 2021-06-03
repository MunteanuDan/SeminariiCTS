package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import tests.dubluri.StudentStub;

public class GrupaTestWithStub {

	@Test
	public void testGetPromovabilitateWStud() {
		IStudent student = new StudentStub();
		Grupa grupa = new Grupa(1077);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(), 0);
	}

}
