import java.util.Scanner;

public class Day1113 {
	public static void main(String[] args) {
		/*
		 * ��������������
		 */
		Scanner sc = new Scanner(System.in);
//		String ga = "����";
//		String ba = "����";
//		String bo = "��";
		int com, user;

		while (true) {

			com = (int) (Math.random() * 3) + 1;
			do {
				System.out.println("����,����,�� �߿� �ϳ��� �����ϼ���");
				System.out.println("����:1 ����:2��:3 ����:4");
				System.out.println(">");
				user = sc.nextInt();
				if (user < 1 || user > 4) {
					System.out.println("�ٽ���");
				} else if (user == 4) {
					System.out.println("��2");
					System.exit(0);
				}
			} while (user < 1 || user > 3);

			String userStr = user == 1 ? "����" : user == 2 ? "����" : "��";
			String comStr = com == 1 ? "����" : com == 2 ? "����" : "��";
			if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("������ ����:" + userStr + ",��ǻ��:" + comStr);
			} else if (user == com) {
				System.out.println("����� ����:" + userStr + ",��ǻ��:" + comStr);
			} else {
				System.out.println("��ǻ�ͽ� ����:" + userStr + ", ��ǻ��:" + comStr);
			}
		}
	}
}
