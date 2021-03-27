package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractPrototype {
	private String denumire;
	private int varsta;
	
	public ClientStadion(String denumire, int varsta) {
		super();
		//validari
		this.denumire = denumire;
		//daca persoana e majora
		//aici se consuma multe resurse
		this.varsta = varsta;
	}

	private ClientStadion() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientStadion [denumire=");
		builder.append(denumire);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		ClientStadion clona = new ClientStadion();
		clona.denumire = this.denumire;
		clona.varsta = this.varsta;
		return clona;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
		
	
}
