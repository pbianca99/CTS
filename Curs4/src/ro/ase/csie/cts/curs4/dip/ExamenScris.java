package ro.ase.csie.cts.curs4.dip;

public class ExamenScris implements InterfataExamen {

	@Override
	public void sustineExamen(String numeStudent, String disciplina) {
		System.out.println(
				String.format("Studentul %s sustime examen scris la %s", numeStudent, disciplina));
	}

	
}
