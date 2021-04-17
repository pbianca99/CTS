package ro.ase.cts.composite.clase;

public abstract class ComponentaMeniu {
	private String nume;
	public abstract void afisareDescriere();
	public abstract ComponentaMeniu getComponenta();
	public abstract void adaugaComponenta(ComponentaMeniu componenta);
	public abstract void stergeComponenta(ComponentaMeniu componenta);
	
	public ComponentaMeniu(String nume) {
		super();
		this.setNume(nume);
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public ComponentaMeniu getComponenta(int poz) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
