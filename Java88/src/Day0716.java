import java.util.Scanner;

public class Day0716 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		/* 몇 단을 출력할지 입력받아서 출력해 주세요 */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력 할까요?:");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i) + "\t");
		}
		System.out.println();

	}
}