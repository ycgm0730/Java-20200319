
public class Day1101 {
	public static void main(String[] args) {
		/* 1~100���� ���� �ϴ� �迭�� ����� ��ü�� ���� ����ϴ� �ڵ带 �ۼ��ϼ��� */

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("1~100�� ��:" + sum);
	}
}
