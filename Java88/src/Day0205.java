

import java.util.Scanner;

public class Day0205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pw;
		System.out.println("��й�ȣ�� \n�Է���\t�ּ���.");
		System.out.print("��й�ȣ: ____\b\b\b\b");
		pw = sc.nextInt();
		System.out.print("�Է��Ͻ� ��й�ȣ�� \"");
		System.out.print(pw);
		System.out.print("\"�Դϴ�.");
		System.out.println("\'\'");
		sc.close();
	}
}
