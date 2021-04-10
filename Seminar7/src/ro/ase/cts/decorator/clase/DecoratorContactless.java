package ro.ase.cts.decorator.clase;

public class DecoratorContactless extends DecoratorAbstract {

	public DecoratorContactless(CardAbstract cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		//System.out.println(((Card)super.getCardAbstract()).getTitular() + " a realizat o plata contactless.");
		//ar trb facut cu getter
	}
	
}
