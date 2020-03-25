import java.util.Scanner;

public class Day0901 {
	public static void main(String[] args) {
		/*
		 * 1~100�߿� �����ϰ� ������ �����Ѵ� �Է��� ���� ���亸�� ũ�� "Up" �Է��� ���� ���亸�� ������ "Down" ���� ����մϴ� �ִ�
		 * ȸ���� 10ȸ�� �����մϴ�. ������ ��Ҹ� ���� ������ ����մϴ�
		 */
		// ��������
		int number = (int) (Math.random() * 100) + 1;
		int inputNum = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		// ���ӽ���
		long startTime = System.currentTimeMillis();
		while (true) {
			// �����Է�
			do {
				if (inputNum != 0) {
					System.out.println("�߸��Է��ϼ̽��ϴ�");
				}
				System.out.println("���ڸ� �Է��� �ּ���(1~100):");
				inputNum = sc.nextInt();
			} while (inputNum < 1 || inputNum > 100);
			// ������
			cnt++;
			if (number == inputNum) {
				System.out.println("�����Դϴ�" + cnt + "ȸ �Է��ϼ̽��ϴ�");
				break;
			} else if (number > inputNum) {
				System.out.println("Up!" + cnt + "ȸ �Է��ϼ̽��ϴ�");
			} else {
				System.out.println("Down!" + cnt + "ȸ �Է��ϼ̽��ϴ�");
			}
			if (cnt == 10) {
				System.out.println("���������� 0���Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
		}
		// �������
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000; // �и��� ->��
		double score = (60 - playTime) / 0.6;
		System.out.println("����������" + score + "�� �Դϴ�. ������ �����մϴ�");
		sc.close();
	}
}
