import java.util.Scanner;

public class Day0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����� �Է����ּ���");
		String grade = sc.next();
		
		switch(grade) {
		
		case "s":
		System.out.println("����� VIP�Դϴ�");
		break;
		case "S":
		System.out.println("����� VIP�Դϴ�");
		break;
		case "a":
		System.out.println("����� ���� �Դϴ�");
		break;
		case "A":
		System.out.println("����� ���� �Դϴ�");
		break;
		case "b":
		System.out.println("����� ����� �Դϴ�");
		break;
		case "B":
		System.out.println("����� ����� �Դϴ�");
		break;
		case "c":
		System.out.println("����� �Ϲݰ� �Դϴ�");
		break;
		default:
		System.out.println("����� �Ϲݰ� �Դϴ�");
		break;
			
		
		
		}
	}

}
