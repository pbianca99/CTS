package ro.ase.cts.factorymethod;

public class FactoryPortar implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int meciuriJucate) {
		return new Portar(nume, meciuriJucate);
	}

}
