package ro.ase.cts.builder;

public class Rezervare {
	private int cod;
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaInclusa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	
	
	public Rezervare(int cod, boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaInclusa,
			boolean muzicaAmbientala, String genMuzica) {
		super();
		this.cod = cod;
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaInclusa = bauturaInclusa;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}


	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}


	public void setBauturaInclusa(boolean bauturaInclusa) {
		this.bauturaInclusa = bauturaInclusa;
	}


	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}


	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [cod=");
		builder.append(cod);
		builder.append(", mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", scaunErgonomic=");
		builder.append(scaunErgonomic);
		builder.append(", bauturaInclusa=");
		builder.append(bauturaInclusa);
		builder.append(", muzicaAmbientala=");
		builder.append(muzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}
	
	
}
