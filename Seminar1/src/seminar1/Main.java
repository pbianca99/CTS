package seminar1;

import clase.Animal;
import clase.Tiger;
import clase.Zebra;
import clase.Zoo;

public class Main {
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal z1 = new Zebra("Zebra1");
		Zebra z2 = new Zebra("Zebra2");
		Tiger t1 = new Tiger("Tiger1");
		Tiger t2 = new Tiger("Tiger2", "Mancare2");
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		zoo.addAnimal(t1);
		zoo.addAnimal(t2);
		zoo.feedAllAnimals();
	}
}