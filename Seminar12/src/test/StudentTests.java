package test;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testCorectitudineConstructorCuParametru() {
		//fail("Not yet implemented");
		String nume = "Gigel";
		Student student  = new Student(nume);
		assertEquals(nume, student.getNume());
		
	}

	@Test
	public void testInitializareListaInConstructorCuParametru() {
		Student student = new Student("Gigel");
		//assertNotEquals(null, student.getNote());
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testCorectitudineConstructorDefault() {
		Student student = new Student();
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testMetodaAdaugareNotaInLista() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(2,student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMediaCorect() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(9.5f, student.calculeazaMedie(), 0.01);//marja de eroare
	}
	
	@Test
	public void testStudentCuRestanta() {
		Student student = new Student();
		student.adaugaNota(4);
		//assertEquals(true, student.areRestante());
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testStudentFaraRestanta() {
		Student student = new Student();
		student.adaugaNota(10);
		//assertEquals(false, student.areRestante());
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaIndexInvalid() {
		Student student = new Student();
		student.adaugaNota(10);
		//1
		try {
			//2
			int nota = student.getNota(-1);
			//3 nu se ajunge
			fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie.");
		}
		catch(IndexOutOfBoundsException exception){
			//4
			 
		}
		catch(Exception exception) {
			//5 nu se ajunge
			fail("Tipul exceptiei aruncate nu este corect.");
		}
		//6 
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaIndexInvalidaJunit4() {
		Student student = new Student();
		student.adaugaNota(10);
		int nota = student.getNota(-1);
	}
}
