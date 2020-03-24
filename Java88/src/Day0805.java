import java.util.Scanner;

public class Day0805 {
	public static void main(String[] args) {
		/*
		 * 몇 줄을 출력할지 입력받아서
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
		 * 위와 같은 형태로 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄 출력:");
		int line = sc.nextInt();
		if (line % 2 == 0) {
			System.out.println("짝수를 입력하셨습니다. 프로그램을 종료합니다");
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
