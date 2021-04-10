package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract {
	private CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}
	
	

	public CardAbstract getCardAbstract() {
		return cardAbstract;
	}


	@Override
	public void platesteLaPOS() {
		// TODO Auto-generated method stub
		cardAbstract.platesteLaPOS();
	}

	@Override
	public void platesteOnline() {
		// TODO Auto-generated method stub
		cardAbstract.platesteOnline();
	}
	
	public abstract void platesteContactless();
	
}
