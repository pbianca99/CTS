package ro.ase.cts.factorymethod;

public class Fundas extends Jucator{

	public Fundas(String nume, int meciuriJucate) {
		super(nume, meciuriJucate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas []");
		builder.append(super.toString());
		return builder.toString();
	}

	
	
}
