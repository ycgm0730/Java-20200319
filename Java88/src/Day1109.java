import java.util.Scanner;

public class Day1109 {
	public static void main(String[] args) {
		/*
		 * 2개의 정수를 입력 받아서 곱을 출력(while 또는 do while 사용) 곱의 값이 500을 초과하면 프로그램 종료
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("두개의 정수를 입력해주세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int res = num1 * num2;
			System.out.println(num1 + "x" + num2 + "=" + res);
			if (res > 400) {
				break;
			}
		}
		System.out.println("결과 값이 500을 초과하여 프로그램을 종료합니다");
		sc.close();
	}
}
