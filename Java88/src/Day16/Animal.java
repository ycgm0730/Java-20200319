package Day16;

public class Animal {
	void speak() {
		System.out.println("���� �Ҹ��� ����");
	}
	void run() {
		System.out.println("�޷����ϴ�");
	}
	void haul(Animal animal) {
		animal.speak();
	}
	
}
