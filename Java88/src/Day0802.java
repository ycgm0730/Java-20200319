import java.util.Scanner;

public class Day0802 {
	public static void main(String[] args) {
		/* Hello, World 0~ Hello, World 9 */

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello, World" + i);
		}
		System.out.println();// ��� ��� ���� �ٿ��

		/* �� ������� �������Ѽ� �������� ��� Hello, World9 ~ Hello,World0 */

		for (int i = 9; i > 0; i--) {
			System.out.println("Hello,World" + i);
		}

		/* @�� 5���� 7�� ����ϼ��� */

		for (int i = 0; i < 7; i++) {
			System.out.println("@@@@@");
		}
		System.out.println();

		/* ���� ��¹��� ��ø for������ �����ϼ��� */

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		/* ���� ��¹����� 2���� 4���� #�� �ǵ��� �����ϼ��� */
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				if (j % 2 == 0) {
					System.out.print("@");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		/* for������ ���ڿ��� �Է¹޾Ƽ� ����ϱ�*/
		Scanner sc= new Scanner(System.in);
		System.out.println("���ڿ��� �Է��� �ּ���");
		String str=sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		sc.close();
	}

}
