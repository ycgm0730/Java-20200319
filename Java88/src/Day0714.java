import java.util.Scanner;

public class Day0714 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까?:");
		int line = sc.nextInt();

	//	for (int i = 0; i <= line; i++) {
			if (line % 2 == 0) {
				System.exit(0); // 짝수라면 종료
			}

			int upLine = line / 2;
			int downLine = line - upLine;

			for (int i = 0; i < upLine; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = downLine; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}