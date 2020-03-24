import java.util.Scanner;

public class Day0802 {
	public static void main(String[] args) {
		/* Hello, World 0~ Hello, World 9 */

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello, World" + i);
		}
		System.out.println();// 결과 출력 한줄 뛰우기

		/* 위 결과물을 반전시켜서 역순으로 출력 Hello, World9 ~ Hello,World0 */

		for (int i = 9; i > 0; i--) {
			System.out.println("Hello,World" + i);
		}

		/* @를 5개씩 7줄 출력하세요 */

		for (int i = 0; i < 7; i++) {
			System.out.println("@@@@@");
		}
		System.out.println();

		/* 위의 출력물을 중첩 for문으로 변경하세요 */

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		/* 위의 출력물에서 2열과 4열이 #이 되도록 변경하세요 */
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				if (j % 2 == 0) {
					System.out.print("@");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		/* for문으로 문자열을 입력받아서 출력하기*/
		Scanner sc= new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요");
		String str=sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		sc.close();
	}

}
