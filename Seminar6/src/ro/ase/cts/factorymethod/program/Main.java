package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.AbstractFactory;
import ro.ase.cts.factorymethod.FactoryAtacant;
import ro.ase.cts.factorymethod.FactoryFundas;
import ro.ase.cts.factorymethod.FactoryMijlocas;
import ro.ase.cts.factorymethod.FactoryPortar;
import ro.ase.cts.factorymethod.Jucator;

public class Main {

	private static void afisareInformatiiJucator(AbstractFactory abstractFactory, String nume, int meciuriJucate) {
		Jucator jucator = abstractFactory.getJucator(nume, meciuriJucate);
		System.out.println(jucator.toString());
	}
	
	public static void main(String[] args) {
		
		afisareInformatiiJucator(new FactoryAtacant(),"Ana", 10);
		afisareInformatiiJucator(new FactoryPortar(), "Mihai", 7);
		afisareInformatiiJucator(new FactoryFundas(), "Andrei", 4);
		afisareInformatiiJucator(new FactoryMijlocas(), "Larisa", 5);
	}

}
