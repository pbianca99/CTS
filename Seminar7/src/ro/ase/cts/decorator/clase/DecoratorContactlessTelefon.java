package ro.ase.cts.decorator.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract {

	public DecoratorContactlessTelefon(CardAbstract cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		// TODO Auto-generated method stub
		System.out.println(((Card)super.getCardAbstract()).getTitular() + " a realizat o plata contactless cu telefonul.");
	}
	
}
