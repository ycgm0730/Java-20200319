import java.util.Scanner;

public class Day0808 {
	public static void main(String[] args) {
		/*
		 * �� ���� �Է¹޾Ƽ� �� ���� �ִ� ������� �ּ� ������� ����ϼ���
		 * 
		 * 3 12=> [3, 12] 2 5 => [1, 10] ��Ʈ: �� ���� ���� �ִ� ����� x �ּ� ������Դϴ�
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��� �ּ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res1 = 0; // �ּҰ����
		int res2 = 0; // �ִ�����

		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				res1 = i;
				break;
			}
		}
		res2 = num1 * num2 / res1;
		System.out.println("�ּҰ����:" + res1 + ",�ִ�����:" + res2);
		sc.close();

	}
}
