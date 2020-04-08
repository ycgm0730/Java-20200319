package Day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalLambda {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Dog", 4);
		Animal animal2 = new Animal("Pig", 2);
		Animal animal3 = new Animal("Snake", 8);

		List<Animal> animallist = new ArrayList<>();
		animallist.add(animal1);
		animallist.add(animal2);
		animallist.add(animal3);

		System.out.println("�Է¼�:" + animallist);
		// �������� ����
		Collections.sort(animallist, (a, b) -> a.age - b.age);
		System.out.println("�������� ����:" + animallist);
		// �������� ����
		Collections.sort(animallist, (a, b) -> b.age - a.age);
		System.out.println("�������� ����:" + animallist);

	}

}

