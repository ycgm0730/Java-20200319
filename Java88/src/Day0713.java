import java.util.Scanner;

public class Day0713 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�?:");
		int line = sc.nextInt();

		for (int i = line; i > 0; i--) { //�ܺ� for���� ���ҽ����� �ٲ۴�
			for (int j = 0; j < i; j++) {
				if (j % 2 == 0) {
					System.out.print("$");
				} else {
					System.out.print("\\");
				}
			}
			System.out.println();
		}
		sc.close();
	}
	// for(int i=line; i>0; i--)
}
