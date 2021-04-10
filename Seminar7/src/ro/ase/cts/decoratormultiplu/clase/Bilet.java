package ro.ase.cts.decoratormultiplu.clase;

public class Bilet implements IOperatorBilet{
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	
	public Bilet() {
		super();
	}

	public Bilet(String numeEchipaGazda, String numeEchipaOaspeti) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}

	@Override
	public void rezervaBilet() {
		System.out.println(numeEchipaGazda + " joaca impotriva " + numeEchipaOaspeti);
		
	}

	@Override
	public String getNumeEchipaGazda() {
		// TODO Auto-generated method stub
		return numeEchipaGazda;
	}

	@Override
	public String getNumeEchipaOaspeti() {
		// TODO Auto-generated method stub
		return numeEchipaOaspeti;
	}
	
		
	
}
