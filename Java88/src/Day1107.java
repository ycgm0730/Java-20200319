import java.util.Scanner;

public class Day1107 {
	public static void main(String[] args) {
		/*
		 * 1개의 정수를 입력 받아서 5의 배수의 개수와 하을 출력 출력내용: 입력 값, 5의 배구싀 개수, 5의 배수의 합
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력:");
		int m = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for (int i = 1; i <= m; i++) {
			if (i % 5 == 0) {
				cnt++;
				sum += i;
			}

		}
		System.out.println("5의 배수의 개수:" + cnt + "5의 배수의 합:" + sum);
		sc.close();
	}
}
