

import java.util.Scanner;

public class Quiz006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int temp;
		
		System.out.print("�Է� N: ");
		n = sc.nextInt();
		System.out.print("�Է� M: ");
		m = sc.nextInt();
		
		System.out.println("��ȯ ��: N = " + n + " , M = " + m);

		/* swap �ڵ� (n=10, m=20���� ����)*/
//		n = m;
//		m = n;
		temp = n;
		n = m;
		m = temp;
		
		System.out.println("��ȯ ��: N = " + n + " , M = " + m);
	}
}
