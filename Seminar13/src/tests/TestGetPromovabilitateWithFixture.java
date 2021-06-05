package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGetPromovabilitateWithFixture {

	private Grupa grupa;
	
	@Before
	public void setUp() {
		grupa = new Grupa(1085);
		for(int i = 0; i < 45; i++) {
			Student student = new Student("Gigel");
			student.adaugaNota(3);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout = 500)
	public void testPerformancePtTimp() {	
		grupa.getPromovabilitate();
	}
	
}
