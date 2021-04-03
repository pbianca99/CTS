package ro.ase.cts.factorymethod;

public class FactoryAtacant implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int meciuriJucate) {
		return new Atacant(nume, meciuriJucate);
	}

}
