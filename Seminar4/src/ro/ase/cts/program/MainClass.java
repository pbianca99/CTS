package ro.ase.cts.program;

import ro.ase.cts.singleton.*;
import ro.ase.cts.singletonlazy.*;

public class MainClass {

	public static void main(String[] args) {
		
		ro.ase.cts.singleton.AsigurareMedicala asigurareMedicala1 = ro.ase.cts.singleton.AsigurareMedicala.getInstance();
		ro.ase.cts.singleton.AsigurareMedicala asigurareMedicala2 = ro.ase.cts.singleton.AsigurareMedicala.getInstance();
		asigurareMedicala1.setId(2);
		asigurareMedicala2.setContributie(125.8f);
		System.out.println(asigurareMedicala1.toString());
		System.out.println(asigurareMedicala2.toString());
		
		ro.ase.cts.singletonlazy.AsigurareMedicala asigurareLazy1 = ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(3, "Ioana", 103.5f);
		ro.ase.cts.singletonlazy.AsigurareMedicala asigurareLazy2 = ro.ase.cts.singletonlazy.AsigurareMedicala.getInstance(4, "Maria", 99.9f);
		System.out.println(asigurareLazy1.toString());
		System.out.println(asigurareLazy2.toString());
	}

}
