import java.util.Scanner;

public class Day1107 {
	public static void main(String[] args) {
		/*
		 * 1���� ������ �Է� �޾Ƽ� 5�� ����� ������ ���� ��� ��³���: �Է� ��, 5�� �豸�� ����, 5�� ����� ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�:");
		int m = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for (int i = 1; i <= m; i++) {
			if (i % 5 == 0) {
				cnt++;
				sum += i;
			}

		}
		System.out.println("5�� ����� ����:" + cnt + "5�� ����� ��:" + sum);
		sc.close();
	}
}
