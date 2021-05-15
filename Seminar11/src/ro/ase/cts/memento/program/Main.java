package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeci;
import ro.ase.cts.memento.clase.MeciJucat;
import ro.ase.cts.memento.clase.Memento;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci = new MeciJucat(100, "FCSB", "Dinamo", 20, 100);
		Memento memento = meci.creareMemento();
		ManagerMeci managerMeci = new ManagerMeci();
		managerMeci.adaugaMemento(memento);
		
		meci.setNrSpectatori(200);
		meci.setNumeEchipaGazda("Universitatea Craiova");
		meci.setNumeEchipaOaspeti("CFR Cluj");
		managerMeci.adaugaMemento(meci.creareMemento());
		
		System.out.println(meci);
		meci.setMemento(managerMeci.getMemento(0));
		System.out.println(meci);
	}

}
