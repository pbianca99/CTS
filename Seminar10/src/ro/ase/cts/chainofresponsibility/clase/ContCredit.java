package ro.ase.cts.chainofresponsibility.clase;

public class ContCredit extends Cont{

	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(suma < super.getSold()) {
			System.out.println("Se face plata din contul de credit pt. suma de "+ suma);
			super.setSold(super.getSold() - suma);
		}
		else if(super.getCont() != null) {
			super.getCont().realizeazaPlata(suma);
		}
		else {
			System.out.println("Tranzactie refuzata!");
		}
		
	}
	
	

}
