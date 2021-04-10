package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorSustinereEchipa extends DecoratorAbstract{

	public DecoratorSustinereEchipa(IOperatorBilet bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	}
	
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Sustinem "+ super.getNumeEchipaGazda());
	}

}
