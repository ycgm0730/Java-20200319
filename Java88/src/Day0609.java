import java.util.Scanner;

public class Day0609 {

	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		Scanner sc = new Scanner(System.in);
	//	int score = 0;
		//int life = 3;

		while (true) {
			/* ����Է� */
			System.out.print("����, ����, �� �� �ϳ��� �����ϼ���(����=a, ����=b, ��=c");
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
				System.out.println("�߸��Է��ϼ̽��ϴ� ���α׷��� �����մϴ�");
				System.exit(0);
			} else if (user == "quit") {
				System.out.println("���Ḧ �����ϼ̽��ϴ�. ���α׷��� �����մϴ�");
				break;
			}
			/* ��ǻ�ͼ��� */
			int number = (int) (Math.random() * 3);
			switch (number) {
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

			if ((user.equals(bo) && com.equals(ba)) || (user.equals(ga) && com.equals(bo))
					|| (user.equals(bo) && com.equals(ga))) {
				System.out.println("�����! ���:" + user + ",��ǻ��" + com);
				// }else (user==com) {

			}
			sc.close();
		}
	}
}
