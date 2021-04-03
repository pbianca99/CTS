package ro.ase.cts.factorymethod;

public class Portar extends Jucator {

	public Portar(String nume, int meciuriJucate) {
		super(nume, meciuriJucate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar []");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	
}
