package tests.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestGetPromovabilitateGrupa;
import tests.TestGetPromovabilitateWithFixture;
import tests.TesteConstructorGrupa;
import tests.TestePromovabilitateCuMockuri;

@RunWith(Suite.class)
@SuiteClasses({TesteConstructorGrupa.class, TestGetPromovabilitateGrupa.class, 
	TestGetPromovabilitateWithFixture.class, TestePromovabilitateCuMockuri.class})
public class AllTests {

}
