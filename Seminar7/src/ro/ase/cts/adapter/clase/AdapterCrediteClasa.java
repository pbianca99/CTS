package ro.ase.cts.adapter.clase;

public class AdapterCrediteClasa extends Leasing implements CreditAbstract{

	public AdapterCrediteClasa(String numeClient, float suma) {
		super(numeClient, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.creeazaLeasing();
	}
	
}
