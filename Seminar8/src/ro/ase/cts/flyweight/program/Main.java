package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new Rezervare(100, 3, 12);
		Rezervare rezervare2 = new Rezervare(120, 4, 15);
		Rezervare rezervare3 = new Rezervare(325, 5, 14);
		
		FabricaClienti fabrica = new FabricaClienti();
		Client clienti = fabrica.getClient("client@test.com");
		clienti.printeazaRezervare(rezervare1);
		fabrica.getClient("client2@test.com").printeazaRezervare(rezervare2);
		fabrica.getClient("client3@test.com").printeazaRezervare(rezervare3);
	}

}
