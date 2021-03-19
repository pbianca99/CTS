package ro.ase.cts.programe;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.readers.ReaderAngajati;
import ro.ase.cts.readers.ReaderAplicanti;
import ro.ase.cts.readers.ReaderStudenti;

public class Program {
	public static List <Aplicant> citireAplicanti(ReaderAplicanti readerAplicanti) throws FileNotFoundException{
		return readerAplicanti.readAplicants();
	}
	
	public static void afiseazaFinantare(Aplicant aplicant) {
		StringBuilder sb = new StringBuilder();
		sb.append("Angajatul ");
		sb.append(aplicant.getNume());
		sb.append(" ");
		sb.append(aplicant.getPrenume());
		sb.append(" primeste ");
		sb.append(aplicant.getSumaFinantare());
		sb.append(" Euro/zi in proiect.");
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti(new ReaderStudenti("studenti.txt"));
			Proiect proiect = new Proiect(80);
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afiseazaStatutAplicant(proiect);
				afiseazaFinantare(aplicant);
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
