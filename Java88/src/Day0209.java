

import java.util.Random;
import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		String name = "";	//String���� ���ڿ�(�ؽ�Ʈ)�� �Է��մϴ�. �ʱ�ȭ�� ""���� �� �� �ֽ��ϴ�.
		int luck = 0;
		Random rd = new Random();
		luck = rd.nextInt(51) + 50;
		luck = (int)(Math.random() * 51) + 50;
		
		//������� �̸��� �Է� �޽��ϴ�.
		System.out.print("�̸��� �Է��� �ּ���: ");
		name = sc.next();
		
		//������ � ���
		System.out.println(name + "���� ������ �����");
		String str = "%�Դϴ�.";	//String������ ���ڿ��� ������ �� �ֽ��ϴ�.
									//String���� ���������� �� ���� ����Ǵ� ���� �ƴ϶�
									//���� ������ �ִ� �޸� �ּҰ� ����˴ϴ�.
									//���� ����ǥ�� ���θ� char���̰� ū ����ǥ�� ���θ� String���Դϴ�.
		System.out.println(luck + str);	//0~100������ ���� ���
		//��������� 50~100������ ���� ����ϰ� ������ �ּ���.
		//��ĳ�� �ݱ�
		sc.close();
	}

}





