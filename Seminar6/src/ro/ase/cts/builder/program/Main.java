package ro.ase.cts.builder.program;

import ro.ase.cts.builder.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare = new Rezervare(1,false,true,true,false,"Jazz");
		System.out.println(rezervare);
		Rezervare rezervare2 = new RezervareBuilder().setCod(10).setBauturaInclusa(true).setMuzicaAmbientala(true).build();
		System.out.println(rezervare2.toString());
		Rezervare rezervare3 = new RezervareBuilder().setCod(11).setScaunErgonomic(true).build();
		System.out.println(rezervare3.toString());
		Rezervare rezervare4 = new RezervareBuilder(12).setGenMuzica("Pop").build();
		System.out.println(rezervare4.toString());
		
		RezervareBuilder builder = new RezervareBuilder();
		Rezervare r1;
		Rezervare r2;
		r1 = builder.setCod(13).setGenMuzica("RnB").build();
		r2 = builder.setCod(14).build();
		System.out.println(r1);
		System.out.println(r2); // dc e shallow copy? pt ca in spate avem aceeasi instanta, initializata in cadrul constructorului (la builder)
		
		
		RezervareBuilderV2 builderV2 = new RezervareBuilderV2().setBauturaInclusa(true).setMancareInclusa(true);
		Rezervare rezervare5 = builderV2.setCod(15).build();
		Rezervare rezervare6 = builderV2.setCod(16).build();
		System.out.println(rezervare5.toString());
		System.out.println(rezervare6.toString()); //acum nu mai facem shallow copy deoarece avem apelul constructorului in metoda build. acum se creeaza 21 bilete
	}

}
