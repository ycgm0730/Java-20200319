import java.util.Random;
import java.util.Scanner;

public class Day0717 {
	public static void main(String[] args) {
		/* �������� */
		final String ga = "����";
		final String ba = "����";
		final String bo = "��";
		Scanner sc = new Scanner(System.in);
		String user = "";
		String com = "";
		int score = 0;
		int life = 3;
		while (true) {
			/* ������ �Է� */
			do {
				System.out.println("����:1,����:2,��:3,4:����");
				System.out.print(">");

				int temp = sc.nextInt();
				switch (temp) {
				case 1:
					user = ga;
					break;
				case 2:
					user = ba;
					break;
				case 3:
					user = bo;
					break;
				case 4:
					System.out.println("4���� �����Ͽ� ���α׷��� �����մϴ�.");
					System.out.println("score:" + score + "life:" + life);
					System.exit(0);
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}

			} while (user.equals(""));

			Random rd = new Random();
			int temp = rd.nextInt(3);
			switch (temp) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
			}
			if ((user.equals(ga) && com.equals(bo)) || (user.equals(ba) && com.equals(ga))
					|| (user.equals(bo) && com.equals(ba))) {
				score += 100;
				System.out.println("������! ����:" + user + ",��ǻ��:" + com);
			} else if (user.equals(com)) {
				score += 10;
				System.out.println("�����! ����:" + user + ",��ǻ��:" + com);

			} else {
				life -= 1;
				System.out.println("score:" + score + ",life:" + life);
				if (life == 0) {
					System.out.println("������ �����մϴ�.");
					System.exit(0);
				}
			}
		}
	}
}