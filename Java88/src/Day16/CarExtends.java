package Day16;

public class CarExtends {
	// �ʵ�
	Tire frontleftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);

	// ������

	// �޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		if(frontleftTire.roll()==false){stop(); return 1;};
		if(frontRightTire.roll()==false){stop(); return 2;};
		if(backLeftTire.roll()==false){stop(); return 3;};;
		if(backRightTire.roll()==false){stop(); return 4;};
		return 0;
	}

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
	}
}
