

import java.util.Scanner;

public class Chapter02Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�, �й�, ���������� �Է��ϼ���: ");
		String name = sc.next();
		int no = sc.nextInt();
		int score = sc.nextInt();
		
		System.out.println("���� �̸��� " + name + "�Դϴ�.");
		System.out.println("�й��� " + no + "�Դϴ�.");
		System.out.println("�׸��� ���������� " + score + "�� �Դϴ�.");
		
		sc.close();
	}
}
