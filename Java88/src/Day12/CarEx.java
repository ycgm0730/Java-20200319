package Day12;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car("�ֿ��ڵ���", "���",350);	//Car ��ü ����(instance)
		
		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		myCar.company="�����ڵ���";
		myCar.model="�ƹݶ�";		// �ʵ�� ��Ʈ������ (.)���� ��밡��
		myCar.color="����";
		myCar.maxSpeed=300;
		myCar.speed=100;
		
		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		Car yourCar = new Car(null, null, 0);	//Car ��ü ����(instance)
		
		System.out.println(yourCar.company);
		System.out.println(yourCar.maxSpeed);
	
		System.out.println("������ ����");
		Car c1=new Car();
		System.out.println(c1.company);
		System.out.println(c1.color);
		System.out.println(c1.model);
		System.out.println(c1.maxSpeed);
		
//	//	Car c2=new Car(250);
//		System.out.println(c2.company);
//		System.out.println(c2.color);
//		System.out.println(c2.model);
//		System.out.println(c2.maxSpeed);
//		
		Car c3=new Car("����", 250);
		System.out.println(c3.company);
		System.out.println(c3.color);
		System.out.println(c3.model);
		System.out.println(c3.maxSpeed);
		
		c3.accel();//�޼ҵ� ȣ��
		c3.speed=325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.brake();
	}

}
