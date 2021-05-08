package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi manager = new ManagerComenzi();
		ContBancar contBancar = new ContBancar("Bianca");
		manager.invocaComanda(new ComandaConstituire(contBancar, 500));
		manager.executaComanda();
		manager.invocaComanda(new ComandaDepunere(contBancar, 200));
		manager.executaComanda();
		manager.invocaComanda(new ComandaRetragere(contBancar,55));
		manager.executaComanda();
		manager.invocaComanda(new ComandaRetragere(contBancar,777));
		manager.executaComanda();

	}

}
