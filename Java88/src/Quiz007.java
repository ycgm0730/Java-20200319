

import java.util.Scanner;

public class Quiz007 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� a: ");
		a = sc.nextInt();
		System.out.print("�Է� b: ");
		b = sc.nextInt();
		
		String stra = "a(" + a + ")";
		String strb = "b(" + b + ")";
		System.out.println("�Է� : " + stra + " , " + strb);
		
		String result = a >= b ? stra : strb;
		System.out.println("��� : " + result);
	}
}
