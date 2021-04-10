package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCrediteClasa;
import ro.ase.cts.adapter.clase.AdapterLeasing;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {
	
	public static void creeazaCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}
		
	public static void main(String[] args) {
		
		Leasing leasing = new Leasing("Bianca", 2023);
		AdapterLeasing adapter = new AdapterLeasing(leasing);
		creeazaCredit(adapter);
		
		AdapterCrediteClasa adapterCrediteClasa = new AdapterCrediteClasa("Ana",4056);
		creeazaCredit(adapterCrediteClasa);
	}

}
