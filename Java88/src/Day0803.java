import java.util.Random;
import java.util.Scanner;

public class Day0803 {
	public static void main(String[] args) {
		/* ������ ����ؼ� ������ ������ ����ϰ� ���� �Է��ϵ��� �ۼ��ϼ��� */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, quiz, answer;

		long startTime = System.currentTimeMillis();
		// System.out.println(startTime);
		for (int i = 0; i < 10; i++) {
			num1 = (int) (Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;

			quiz = num1 * num2;

			System.out.print(num1 + "x" + num2 + "=");
			answer = sc.nextInt();

			if (quiz == answer) {
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ �����մϴ�");
				System.exit(0);
				break;

			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("[��������ð�]");
		System.out.println(endTime - startTime + "ms");
		sc.close();
	}

}
