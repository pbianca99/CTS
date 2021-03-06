package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public interface ReaderAplicanti {
	List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}
