import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("���Ḧ �ֹ��� �ּ���");
				String menu = sc.next();
				
				switch(menu) {
				
				case "a":
				case "A":
					System.out.println("�Ƹ޸�ī�� ���Խ��ϴ�");
					break;
				case "b":
					System.out.println("īǪġ�� ���Խ��ϴ�");
					break;
				case "B":
					System.out.println("īǪġ�� ���Խ��ϴ�");
					break;
				case "c":
					System.out.println("�� ���Խ��ϴ�");
					break;
				case "C":
					System.out.println("�� ���Խ��ϴ�");
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
