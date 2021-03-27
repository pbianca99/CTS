package ro.ase.cts.prototype.clase;

public class Bilet implements AbstractPrototype{
	private int cod;
	private String numeEchipa1;
	private String numeEchipa2;
	private String dataSiOra;
	public Bilet(int cod, String numeEchipa1, String numeEchipa2, String dataSiOra) {
		super();
		this.cod = cod;
		this.numeEchipa1 = numeEchipa1;
		this.numeEchipa2 = numeEchipa2;
		this.dataSiOra = dataSiOra;
	}
	public Bilet() {
		super();
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public void setNumeEchipa1(String numeEchipa1) {
		this.numeEchipa1 = numeEchipa1;
	}
	public void setNumeEchipa2(String numeEchipa2) {
		this.numeEchipa2 = numeEchipa2;
	}
	public void setDataSiOra(String dataSiOra) {
		this.dataSiOra = dataSiOra;
	}
	@Override
	public AbstractPrototype copiaza() {
		Bilet copie = new Bilet();
		copie.cod = this.cod;
		copie.numeEchipa1 = this.numeEchipa1;
		copie.numeEchipa2 = this.numeEchipa2;
		copie.dataSiOra = this.dataSiOra;
		return copie;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [cod=");
		builder.append(cod);
		builder.append(", numeEchipa1=");
		builder.append(numeEchipa1);
		builder.append(", numeEchipa2=");
		builder.append(numeEchipa2);
		builder.append(", dataSiOra=");
		builder.append(dataSiOra);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
