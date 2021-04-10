package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		Card card = new Card("Alex", "1924");
		card.platesteOnline();
		card.platesteLaPOS();
		DecoratorAbstract decoratorAbstract = new DecoratorContactless(card);
		decoratorAbstract.platesteContactless();
		//decoratorAbstract.platesteLaPOS();
		//decoratorAbstract.platesteOnline();
		DecoratorAbstract decoratorAbstract2 = new DecoratorContactlessTelefon(card);
		decoratorAbstract2.platesteContactless();
		DecoratorAbstract decoratorAbstract3 = new DecoratorContactless(decoratorAbstract2);
		//decoratorAbstract3.platesteContactless();
	}

}
