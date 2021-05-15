package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ManagerSala managerSala = new ManagerSala("Sala de sport");
		ClientAbonat client1 = new ClientAbonat("Bianca");
		ClientAbonat client2 = new ClientAbonat("Ioana");
		ClientAbonat client3 = new ClientAbonat("Daniela");
		managerSala.aboneaza(client1);
		managerSala.aboneaza(client2);
		managerSala.aboneaza(client3);
		managerSala.anuntaMeci("fotbal");
		managerSala.dezaboneaza(client3);
		managerSala.anuntaMeci("volei");
	}

}
