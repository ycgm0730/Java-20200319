import java.util.Scanner;

public class Day0806 {
	public static void main(String[] args) {
		/* ������ ���� 10ȸ �Ϸ�� ���� �ð��� ����ϼ��� */

		Scanner sc = new Scanner(System.in);

		long startTime = System.currentTimeMillis();
		// System.out.println(startTime);
		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random() * 8) + 2;
			int num2 = (int) (Math.random() * 9) + 1;
			System.out.println(num1 + "x" + num2 + "=");
			int inputNum = sc.nextInt();
			if (inputNum == num1 * num2) {
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("�����Դϴ�.�����������մϴ�");
				System.exit(0);

			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("[��������ð�]");
		System.out.println(endTime - startTime + "ms");
		sc.close();
	}
}
