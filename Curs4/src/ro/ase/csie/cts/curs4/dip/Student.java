package ro.ase.csie.cts.curs4.dip;

public class Student {
	String nume = "Anonim";
	int grupa;
	String facultate;
	
	InterfataExamen examen = null; //implicit e null
	
	//InterfataExamen examen = new ExamenScris();
	
	public Student(String nume, InterfataExamen examen /*Dependency injection aici, prin constructor*/) {
		this.nume = nume;
		this.examen = examen;
	}
	
	//injectam o referinta prin acest setter
	public void setModalitateExamen(InterfataExamen examen) {
		if(examen == null) {
			throw new NullPointerException();
		}
		this.examen = examen;
	}
	
	public void sustineExamen(String disciplina) {
		//System.out.println(
			//	String.format("Studentul %s sustine examen scris la %s", this.nume,disciplina));
		
		//call-back
		examen.sustineExamen(this.nume, disciplina);
	}
}
