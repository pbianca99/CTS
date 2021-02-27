package seminar1;

import clase.Animal;
import clase.Zebra;
import clase.Zoo;

public class Main {
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal z1 = new Zebra("Zebra1");
		Zebra z2 = new Zebra("Zebra2");
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		zoo.feedAllAnimals();
	}
}