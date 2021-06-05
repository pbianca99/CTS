package tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestGetPromovabilitateGrupa;
import tests.TestGetPromovabilitateWithFixture;
import tests.TesteConstructorGrupa;
import tests.TestePromovabilitateCuMockuri;
import tests.suite.categorii.TestePromovabilitateCategory;
import tests.suite.categorii.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses({TesteConstructorGrupa.class, TestGetPromovabilitateGrupa.class, 
	TestGetPromovabilitateWithFixture.class, TestePromovabilitateCuMockuri.class})
@Categories.IncludeCategory(TestePromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class CustomSuite {

}
