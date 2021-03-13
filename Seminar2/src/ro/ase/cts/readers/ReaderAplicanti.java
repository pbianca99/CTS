package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String numeFisier; //ca sa aiba acces clasele fiu fara sa ii facem getteri si setteri
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException;
	
	public ReaderAplicanti(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	
	
}
