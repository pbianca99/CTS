package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
	private String nume;
	
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(this.nume + "s-a asezat la coada.");
		
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println(this.nume + " a prezentat biletul.");
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println(this.nume + " a fost controlat corporal.");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(this.nume + " a ocupat un loc.");
		
	}
	
}
