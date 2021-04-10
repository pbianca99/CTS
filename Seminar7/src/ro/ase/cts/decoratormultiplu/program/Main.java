package ro.ase.cts.decoratormultiplu.program;

import ro.ase.cts.decoratormultiplu.clase.Bilet;
import ro.ase.cts.decoratormultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratormultiplu.clase.DecoratorSustinereEchipa;
import ro.ase.cts.decoratormultiplu.clase.DecoratorUrare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet = new Bilet("Steaua", "Dinamo");
		bilet.rezervaBilet();
		
		DecoratorAbstract meciInGhencea = new DecoratorSustinereEchipa(bilet);
		meciInGhencea.rezervaBilet();
		
		DecoratorAbstract meciDePaste = new DecoratorUrare(bilet);
		meciDePaste.rezervaBilet();
		
		DecoratorAbstract meciInGenceaDePaste = new DecoratorSustinereEchipa(meciDePaste);
		System.out.println();
		meciInGenceaDePaste.rezervaBilet();
	}

}
