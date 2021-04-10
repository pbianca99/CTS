package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorAbstract implements IOperatorBilet{
	
	private IOperatorBilet bilet;
	
	
	public DecoratorAbstract(IOperatorBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		bilet.rezervaBilet();
		//System.out.println("Sustinem " + bilet.getNumeEchipaGazda());
		
	}

	@Override
	public String getNumeEchipaGazda() {
		// TODO Auto-generated method stub
		return bilet.getNumeEchipaGazda();
	}

	@Override
	public String getNumeEchipaOaspeti() {
		// TODO Auto-generated method stub
		return bilet.getNumeEchipaOaspeti();
	}
	
	
}
