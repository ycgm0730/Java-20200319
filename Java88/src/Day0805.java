import java.util.Scanner;

public class Day0805 {
	public static void main(String[] args) {
		/*
		 * �� ���� ������� �Է¹޾Ƽ�
		 * 
		 * @
		 * 
		 * @@
		 * 
		 * @@@
		 * 
		 * @@@@
		 * 
		 * @@@@@
		 * 
		 * @@@@
		 * 
		 * @@@
		 * 
		 * @@
		 * 
		 * @
		 * 
		 * ���� ���� ���·� ����ϼ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���:");
		int line = sc.nextInt();
		if (line % 2 == 0) {
			System.out.println("¦���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�");
			System.exit(0);
		}
		int upline = line / 2;
		int downline = line - upline;
		for (int i = 0; i < upline; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();

		}
		for (int i = downline; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		sc.close();
	}
}
