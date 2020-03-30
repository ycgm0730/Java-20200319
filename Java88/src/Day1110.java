import java.util.Scanner;

public class Day1110 {
	public static void main(String[] args) {
		/*
		 * 출석, 과제, 중간고사, 기말고사 점수는 100점 만점을 기준으로 입력받는다 출석20% 과제 20% 중간고사 30% 기말고사 30%
		 */
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0;
		char grade = 0;
		do {
			if (a < 0 || a > 100) {
				System.out.println("입력 범위를 초과하였습니다");
			}
			System.out.println("출석 점수를 입력해주세요");
			a = sc.nextInt();
		} while (a < 0 || a > 100);
		do {
			if (b < 0 || b > 100) {
				System.out.println("입력 범위를 초과하였습니다");
			}
			System.out.println("과제 점수를 입력해주세요");
			b = sc.nextInt();
		} while (b < 0 || b > 100);
		do {
			if (c < 0 || c > 100) {
				System.out.println("입력 범위를 초과하였습니다");
			}
			System.out.println("중간고사 점수를 입력해주세요");
			c = sc.nextInt();
		} while (c < 0 || c > 100);
		do {
			if (d < 0 || d > 100) {
				System.out.println("입력 범위를 초과하였습니다");
			}
			System.out.println("기말고사 점수를 입력해주세요");
			d = sc.nextInt();
		} while (d < 0 || d > 100);

		int score = (int) (a / 100.0 * 20 + b / 100.0 * 20 + c / 100.0 * 30 + d / 100.0 * 30);
		System.out.println("총점은" + score + "입니다");
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';

		}
		System.out.println("당신의 학점은" + grade + "입니다");
		sc.close();
	}

}
