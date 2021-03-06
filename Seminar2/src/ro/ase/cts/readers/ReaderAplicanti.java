package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String numeFisier; //ca sa aiba acces clasele fiu fara sa ii facem getteri si setteri
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException;
	
	public ReaderAplicanti(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	public void readAplicant(Scanner scanner, Aplicant aplicant){
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr = scanner.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(vect, nr);
	}
	
}
