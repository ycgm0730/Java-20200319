
//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day1106 {
	public static void main(String[] args) {
		/*
		 * �ζ� ������ �ۼ� 1. 6���� ������ ����(1~45)�� �迭�� �Է��ϼ��� 2. �ߺ����� �ʵ��� �ۼ��ϼ���
		 */

		int[] lot = new int[6];
		Random rd = new Random();
		System.out.println("�ζ� ������");
		System.out.println("�� ������ �����Ͻðڽ��ϴ�?:");
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();

		for (int x = 0; x < game; x++) {
			for (int i = 0; i < lot.length; i++) {
				lot[i] = rd.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (lot[i] == lot[j]) {
						i--;
						break;
					}
				}
			}
			/* ���� ������ ����ؼ� �迭�� ������������ �����ϼ��� */
			for (int i = 0; i < lot.length; i++) {
				for (int j = 0; j < lot.length - 1; j++) {
					if (lot[i] < lot[j]) {
						int temp = lot[i];
						lot[i] = lot[j];
						lot[j] = temp;
					}
				}
			}

			// Arrays.sort(lot);
			for (int i = 0; i < lot.length; i++) {
				System.out.print(lot[i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}