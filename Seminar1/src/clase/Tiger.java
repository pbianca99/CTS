package clase;

public class Tiger extends Animal{
	private String mancare;
	
	public Tiger(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	public Tiger(String nume, String mancare) {
		super(nume);
		this.mancare = mancare;
	}

	public String getMancare() {
		return mancare;
	}

	public void setMancare(String mancare) {
		this.mancare = mancare;
	}

}
