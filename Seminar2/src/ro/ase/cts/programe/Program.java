package ro.ase.cts.programe;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.ReaderAngajati;
import ro.ase.cts.readers.ReaderAplicanti;
import ro.ase.cts.readers.ReaderStudenti;

public class Program {
	public static List <Aplicant> citireAplicanti(ReaderAplicanti readerAplicanti) throws FileNotFoundException{
		return readerAplicanti.readAplicants();
	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti(new ReaderStudenti("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
