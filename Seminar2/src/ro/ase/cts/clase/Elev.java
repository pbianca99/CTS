package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare = 30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int clasaElev) {
		this.clasa = clasaElev;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	public float getSumaFinantare() {
		return sumaFinantare;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev: ");
		sb.append(super.toString());
		sb.append(", clasa=").append(clasa);
		sb.append(", tutore=").append(tutore);
		return sb.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
}
