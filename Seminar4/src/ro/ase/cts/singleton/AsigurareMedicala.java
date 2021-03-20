package ro.ase.cts.singleton;

public class AsigurareMedicala {
	private int id;
	private String numeAsigurat;
	private float contributie;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNumeAsigurat(String numeAsigurat) {
		this.numeAsigurat = numeAsigurat;
	}
	
	public void setContributie(float contributie) {
		this.contributie = contributie;
	}
	
	private static AsigurareMedicala asigurareMedicala = new AsigurareMedicala(1, "Bianca", 144.4f);
	//1. apelam constructorul 1 singura data
	
	private AsigurareMedicala(int id, String numeAsigurat, float contributie) {
		super();
		this.id = id;
		this.numeAsigurat = numeAsigurat;
		this.contributie = contributie;
	}
	
	//2.getInstance
	public static AsigurareMedicala getInstance() {
		return asigurareMedicala;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsigurareMedicala [id=");
		builder.append(id);
		builder.append(", numeAsigurat=");
		builder.append(numeAsigurat);
		builder.append(", contributie=");
		builder.append(contributie);
		builder.append("]");
		return builder.toString();
	}
	
	
}
