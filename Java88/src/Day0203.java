

public class Day0203 {
	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000;	//int�� ������ -21�� ~ 21�� �Դϴ�.
		int result = number1 + number2;	//������ �Ѿ�� �����÷ο찡 �߻��մϴ�.
		System.out.println(result);
		
		long result2 = number1 + number2;	//�������� ������ int + int�Դϴ�.
											//�׷��� ������� int�Դϴ�.
		System.out.println(result2);
		
		long num3 = 1000000000;
		long num4 = 2000000000;
		long result3 = num3 + num4;
		System.out.println(result3);
		
		long result4 = 1000000000L + 2000000000L;	//�Ϲ������� ���꿡�� ����ϴ� ������ int�Դϴ�.
		System.out.println(result4);
		
		byte num5 = 15;
		byte num6 = 1;
		int result5 = num5 + num6;	//�ڹ��� �⺻ ������ int�Դϴ�. byte+byte�� ����� int�Դϴ�.
		System.out.println(result5);
		
		short num7 = 3000;
		short num8 = 5000;
		int result6 = num7 + num8;	//short+short�� ����� int�Դϴ�.
		System.out.println(result6);
		
		long result7 = num7 + num8;	//�������� �ڷ����� ������ �ڷ������� ���� ���
									//�����ʿ��� �������� ������ �����մϴ�.
									//�ڵ�����ȯ, ����������ȯ, promotion
//		int result8 = 10L;	//long���� int�� ������ �� �����ϴ�.
		
		int num9 = 10;
		int num10 = 20;
		short result9 = (short)(num9 + num10);	//��������ȯ, ���������ȯ, casting
												//ū�ڷ����� �����ڷ������� ��ȯ�� ����
												//��������ȯ�� �ؾ� �մϴ�.
		System.out.println(result9);
		
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11 + num12);
		System.out.println(result10);
	}
}
/*
 	40,000�� 2������ 1001 1100 0100 0000
*/














