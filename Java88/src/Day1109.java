import java.util.Scanner;

public class Day1109 {
	public static void main(String[] args) {
		/*
		 * 2���� ������ �Է� �޾Ƽ� ���� ���(while �Ǵ� do while ���) ���� ���� 500�� �ʰ��ϸ� ���α׷� ����
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�ΰ��� ������ �Է����ּ���");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int res = num1 * num2;
			System.out.println(num1 + "x" + num2 + "=" + res);
			if (res > 400) {
				break;
			}
		}
		System.out.println("��� ���� 500�� �ʰ��Ͽ� ���α׷��� �����մϴ�");
		sc.close();
	}
}
