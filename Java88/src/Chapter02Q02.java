

import java.util.Scanner;

public class Chapter02Q02 {
	public static void main(String[] args) throws Exception {
		int intnum;
		double dblnum;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Ǽ��� �Է��ϼ���! : ");
		intnum = sc.nextInt();
		dblnum = sc.nextDouble();
		System.out.println("�Է��� ������ " + intnum + " �Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + dblnum + " �Դϴ�.");
		
		sc.close();
	}
}
