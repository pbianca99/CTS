package ro.ase.cts.factorymethod;

public class FactoryFundas implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int meciuriJucate) {
		return new Fundas(nume, meciuriJucate);
	}

}
