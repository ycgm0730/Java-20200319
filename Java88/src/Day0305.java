

public class Day0305 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 20;
		System.out.println("num1 = 10, num2 = 20");
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		System.out.println();
		
		System.out.println("num2 = 20, num3 = 20");
		System.out.println("num3 < num2 : " + (num3 < num2));
		System.out.println("num3 <= num2 : " + (num3 <= num2));
		System.out.println("num3 > num2 : " + (num3 > num2));
		System.out.println("num3 >= num2 : " + (num3 >= num2));
		System.out.println("num3 == num2 : " + (num3 == num2));
		System.out.println("num3 != num2 : " + (num3 != num2));
		
		/*
		 * =�� 1�� ����ϸ� ���Կ����ڷ� �������� ���� �������� �����մϴ�.
		 * ==�� 2�� ����ϸ� ���ʰ� ������ ���� ���������� �Ǵ��մϴ�.
		 */
		
		boolean result = num1 < num2;
		System.out.println(result);
	}
}















