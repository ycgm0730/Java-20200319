

import java.util.Scanner;

public class Chapter02Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, height;
		int area, perimeter;
		System.out.print("�ʺ� �Է��� �ּ���: ");
		width = sc.nextInt();
		System.out.print("���̸� �Է��� �ּ���: ");
		height = sc.nextInt();
		
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println("�簢���� ����: " + area);
		System.out.println("�簢���� �ѷ�: " + perimeter);
		
		sc.close();
	}
}
