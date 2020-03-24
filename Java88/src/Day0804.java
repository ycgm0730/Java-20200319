import java.util.Scanner;

public class Day0804 {
	public static void main(String[] args) {
		/*
		 * 몇줄을 출력할지 입력받아서
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
		 * 위와 같은 형태로 출력하세요
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄을 입력하시겠습니까?:");
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
