package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.Student;
import tests.suite.categorii.TestePromovabilitateCategory;

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
	@Category(TestePromovabilitateCategory.class)
	public void testPerformancePtTimp() {	
		grupa.getPromovabilitate();
	}
	
}
