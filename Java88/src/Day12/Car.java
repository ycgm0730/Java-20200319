package Day12;

public class Car { // Car.java�� public�̿��� �Ѵ�
	/* �ʵ� */
	public static void/*����Ÿ��*/ main(String[] args) {
	}

	String company = "����ڵ���";
	String model = "���";
	String color = "����";
	int maxSpeed = 250;
	int speed = 100;

	/* ������ */
	Car() { // �����ڸ� �������� ������ �⺻�����ڰ� �ڵ����� �ۼ��˴ϴ�.

	}

	Car(String com, String col, int max) {
		this.company = com;
		this.color = col;
		this.maxSpeed = max;
	}

	Car(String company, int maxSpeed, String color) {
		this.company = "����ڵ���";
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String color, int maxSpeed){
	//	this.(String company, int maxSpeed, String color);
	

	}

	
	
	Car(String color, int speed, int maxSpeed){
		
	}
	
	Car(String company, String color, int maxSpeed, int speed){
		
	}
	
	Car(int maxSpeed, String company, String color ){ //�ڷ��� ������ �ٸ��ų� �����ڰ� �޶������ �ߺ������ڷ� ����Ҽ��ִ�
			//�����ڴ� overoding �Ҽ��ִ�:�ߺ�����	
//		����Ÿ��=���� 
//		�޼ҵ� �̸� ���� 
//		�Ű������� Ÿ�� ���� ������ �޶����
		//�Ű������� ��(ũ��)�� �𸦶� �迭�� ����ϰų� (...)�� ��밡��
	}
	/*�޼ҵ�(�޼���)*/
	void accel() {
		speed +=10;
		if(speed> maxSpeed) {
			speed=maxSpeed;
		}
		System.out.println("���� �ӵ�:"+speed);
	}
	void brake(){
		speed=0;
		System.out.println("���� �ӵ�:"+speed);
	}
	
}
