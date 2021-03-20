package ro.ase.cts.pi;


public class Piesa {
	private String denumire;
	private int durata;
	private boolean ePremiera;
	
	private static Piesa piesa = null;

	private Piesa(String denumire, int durata, boolean ePremiera) {
		super();
		this.denumire = denumire;
		this.durata = durata;
		this.ePremiera = ePremiera;
	}
	
	
	public static synchronized Piesa getInstance(String denumire, int durata, boolean ePremiera) {
		if (piesa == null) {
			piesa = new Piesa(denumire, durata, ePremiera);
		}
		return piesa;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	public void setePremiera(boolean ePremiera) {
		this.ePremiera = ePremiera;
	}


	public static void setPiesa(Piesa piesa) {
		Piesa.piesa = piesa;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piesa [denumire=");
		builder.append(denumire);
		builder.append(", durata=");
		builder.append(durata);
		builder.append(", ePremiera=");
		builder.append(ePremiera);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
