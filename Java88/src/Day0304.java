

import java.util.Random;

public class Day0304 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		int res1 = num1 + num2;	//10 + 3
		int res2 = num1 - num2; //10 - 3
		int res3 = num1 * num2;	//10 * 3
		int res4 = num1 / num2;	//10 / 3
		int res5 = num1 % num2;	//10 % 3
		double res6 = num1 / num2;	//���� ������ ������ ����մϴ�.
		double res7 = (double)num1 / num2;	//num1�� ��������ȯ �ϸ鼭 num2�� �ڵ�����ȯ
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		System.out.println(res7);
		
		int res8 = num1 % 2;
		System.out.println(res8);
		
		Random rd = new Random();
		int num3 = rd.nextInt();
		System.out.println(num3);
		int res9 = Math.abs(num3) % 45 + 1;
		System.out.println(res9);
	}
}















