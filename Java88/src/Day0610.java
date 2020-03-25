import java.util.Scanner;

public class Day0610 {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc =new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while (!inputString.equals("q"));		// !로 인해 q가 아니라면 반복을 종료해라라고 됨
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}

}
