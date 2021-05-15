package ro.ase.cts.observer.clase;

public class ClientAbonat implements IObserver{
	private String nume;

	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteAnunt(String mesaj) {
		System.out.println(nume + " a primit anuntul "+ mesaj);
		
	}
	
}
