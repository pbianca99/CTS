package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorUrare extends DecoratorAbstract {

	public DecoratorUrare(IOperatorBilet bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Paste fericit!");
	}
	
	

}
