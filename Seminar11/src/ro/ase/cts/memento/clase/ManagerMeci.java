package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeci {
	//Manager de mementouri !
	private List<Memento> listaMeciuriSalvate;

	public ManagerMeci() {
		super();
		this.listaMeciuriSalvate = new ArrayList<>();
	}

	
	public void adaugaMemento(Memento memento) {
		this.listaMeciuriSalvate.add(memento);
	}
	
	public Memento getMemento(int poz) {
		if(poz >= 0 && poz < this.listaMeciuriSalvate.size()) {
			return this.listaMeciuriSalvate.get(poz);
		}
		throw new IndexOutOfBoundsException();
	}
	
	public Memento undo() {
		return this.listaMeciuriSalvate.get(this.listaMeciuriSalvate.size() - 1);
	}
}
