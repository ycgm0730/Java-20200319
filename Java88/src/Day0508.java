import java.util.Scanner;

public class Day0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 등급을 입력해주세요");
		String grade = sc.next();
		
		switch(grade) {
		
		case "s":
		System.out.println("당신은 VIP입니다");
		break;
		case "S":
		System.out.println("당신은 VIP입니다");
		break;
		case "a":
		System.out.println("당신은 우대고객 입니다");
		break;
		case "A":
		System.out.println("당신은 우대고객 입니다");
		break;
		case "b":
		System.out.println("당신은 우수고객 입니다");
		break;
		case "B":
		System.out.println("당신은 우수고객 입니다");
		break;
		case "c":
		System.out.println("당신은 일반고객 입니다");
		break;
		default:
		System.out.println("당신은 일반고객 입니다");
		break;
			
		
		
		}
	}

}
