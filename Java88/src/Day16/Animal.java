package Day16;

public class Animal {
	void speak() {
		System.out.println("울음 소리를 내다");
	}
	void run() {
		System.out.println("달려갑니다");
	}
	void haul(Animal animal) {
		animal.speak();
	}
	
}
