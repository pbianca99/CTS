package ro.ase.cts.chainofresponsibility.program;

import ro.ase.cts.chainofresponsibility.clase.Cont;
import ro.ase.cts.chainofresponsibility.clase.ContCredit;
import ro.ase.cts.chainofresponsibility.clase.ContCurent;
import ro.ase.cts.chainofresponsibility.clase.ContEconomii;

public class Main {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(200);
		Cont contEconomii = new ContEconomii(300);
		Cont contCredit = new ContCredit(400);
		
		//setam succesorii
		contCurent.setCont(contEconomii);
		contEconomii.setCont(contCredit);
		
		contCurent.realizeazaPlata(150);
		contCurent.realizeazaPlata(300);
		contCurent.realizeazaPlata(200);
		contCurent.realizeazaPlata(200);
	}

}
