package Day16;

public class AnimalEx {
	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.speak();
		a1.run();
		
		a1 = new Dog();
		a1.speak();
		a1.run();
		System.out.println();
		
		a1=new Cat();
		a1.speak();
		a1.run();
		System.out.println();
		
		Animal a2= new Animal();
		Cat cat =new Cat();
		Dog dog =new Dog();
		a2.haul(cat);
		a2.haul(dog);
		
	}
}
