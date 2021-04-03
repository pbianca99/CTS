package ro.ase.cts.builder.program;

import ro.ase.cts.builder.Rezervare;

public class RezervareBuilder implements AbstractBuilder{
	
	private Rezervare rezervare;
	
	
	public RezervareBuilder() {
		rezervare = new Rezervare(0, false, false, false, false, "");
	}
	
	public RezervareBuilder(int cod) {
		rezervare = new Rezervare(cod, false, false, false, false, "");
	}

	public RezervareBuilder setCod(int cod) {
		rezervare.setCod(cod);
		return this;
	}
	
	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}
	
	public RezervareBuilder setBauturaInclusa(boolean bauturaInclusa) {
		rezervare.setBauturaInclusa(bauturaInclusa);
		return this;
	}
	
	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	
	@Override
	public Rezervare build() {
		return rezervare;
	}
	
}
