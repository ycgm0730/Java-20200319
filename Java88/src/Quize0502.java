import java.util.Scanner;

public class Quize0502 {

	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int life = 3;

		while (true) {
			/* ��� �Է� */
			System.out.print("����,����,�� �� �ϳ��� �����ϼ���.(����=a, ����=b, ��=c ����=q)");
			user = sc.next();
			switch (user) {
			case "a":
			case "A":
				user = ga;
				break;
			case "b":
			case "B":
				user = ba;
				break;
			case "c":
			case "C":
				user = bo;
				break;
			case "q":
			case "Q":
				user = "quit";
				break;
			default:
				user = "error";
			}
			if (user == "error") {
				System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			/* ��ǻ�� ���� */
			int number = (int) (Math.random() * 3);
			switch (number) {
			case 0:
				com = "ga";
				break;
			case 1:
				com = "ba";
				break;
			case 2:
				com = "bo";
				break;
			}

			if (user.equals(bo) && com.equals(ba) || (user.equals(ga) && com.equals(bo))
					|| (user.equals(ba)) && com.equals(ga)) {
				System.out.println("�����! ���:" + user + ".��ǻ��:" + com);
				score += 10;
			} else if (user == com) {
				System.out.println("�����ϴ�! ���:" + user + ",��ǻ��:" + com);
				score += 1;
			} else {
				System.out.println("��ǻ�� ��! ���:" + user + "��ǻ��:" + com);
				life -= 1;
			}
			System.out.println("���� ����:" + score + "���� ������" + life);
			System.out.println();

			if (life == 0) {
				break;
			}
			sc.close();
		}
	}

}
