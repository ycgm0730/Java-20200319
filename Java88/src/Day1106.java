
//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day1106 {
	public static void main(String[] args) {
		/*
		 * 로또 생성기 작성 1. 6개의 랜덤한 숫자(1~45)를 배열에 입력하세요 2. 중복되지 않도록 작성하세요
		 */

		int[] lot = new int[6];
		Random rd = new Random();
		System.out.println("로또 생성기");
		System.out.println("몇 게임을 생성하시겠습니다?:");
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
			/* 버블 정렬을 사용해서 배열을 오름차순으로 정렬하세요 */
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