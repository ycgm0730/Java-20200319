import java.util.Scanner;

public class Day0804 {
	public static void main(String[] args) {
		/*
		 * ������ ������� �Է¹޾Ƽ�
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
		 * ���� ���� ���·� ����ϼ���
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻðڽ��ϱ�?:");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
