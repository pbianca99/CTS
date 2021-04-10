package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract{
	private String titular;
	private String numarCard;
	
	public Card(String titular, String numarCard) {
		super();
		this.titular = titular;
		this.numarCard = numarCard;
	}

	@Override
	public void platesteLaPOS() {
		System.out.println(this.titular + " a realizat o plata la POS.");
		
	}

	@Override
	public void platesteOnline() {
		System.out.println(this.titular + " a realizat o plata Online.");
		
	}

	public String getTitular() {
		return titular;
	}
	
	
	
}
