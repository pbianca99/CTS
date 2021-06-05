package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import mockuri.StudentDummy;
import mockuri.StudentFake;
import mockuri.StudentStub;

public class TestePromovabilitateCuMockuri {

	@Test
	public void testReferenceAdaugaStudent() {
		Grupa grupa = new Grupa(1070);
		grupa.adaugaStudent(new StudentDummy());
		grupa.adaugaStudent(new StudentDummy());
		assertEquals(2, grupa.getStudenti().size());
	}
	
	@Test
	public void testReferenceCuStub() {
		Grupa grupa = new Grupa(1070);
		grupa.adaugaStudent(new StudentStub());
		grupa.adaugaStudent(new StudentStub());
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testReferenceCuFake() {
		Grupa grupa = new Grupa(1059);
		for(int i = 0; i < 7; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(false);
			grupa.adaugaStudent(student);
		}
		for(int i = 0; i < 3; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
	}
}
