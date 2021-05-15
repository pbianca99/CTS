package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;


public abstract class ManagerSalaAbstract {
	List<IObserver> listaClientiAbonati;
	
	public ManagerSalaAbstract() {
		super();
		listaClientiAbonati = new ArrayList<>();
	}
	
	public void aboneaza(IObserver observer) {
		listaClientiAbonati.add(observer);
	}
	
	public void dezaboneaza(IObserver observer) {
		listaClientiAbonati.remove(observer);
	}
	
	
	public void notifica(String mesaj) {
		for(IObserver o : listaClientiAbonati) {
			o.primesteAnunt(mesaj);
		}
	}
}
