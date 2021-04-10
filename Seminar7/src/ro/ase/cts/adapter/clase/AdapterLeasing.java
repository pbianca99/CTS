package ro.ase.cts.adapter.clase;

public class AdapterLeasing implements CreditAbstract{
	private Leasing leasing;
		
	public AdapterLeasing(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit() {
		leasing.creeazaLeasing();
		
	}
	
	
}
