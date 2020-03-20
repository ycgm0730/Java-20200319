import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("음료를 주문해 주세요");
				String menu = sc.next();
				
				switch(menu) {
				
				case "a":
				case "A":
					System.out.println("아메리카노 나왔습니다");
					break;
				case "b":
					System.out.println("카푸치노 나왔습니다");
					break;
				case "B":
					System.out.println("카푸치노 나왔습니다");
					break;
				case "c":
					System.out.println("라떼 나왔습니다");
					break;
				case "C":
					System.out.println("라떼 나왔습니다");
					break;
				case "d":
					System.out.println("");
					break;
				case "D":
					System.out.println("");
					break;
				}

	}

}
