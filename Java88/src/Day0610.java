import java.util.Scanner;

public class Day0610 {
	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner sc =new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while (!inputString.equals("q"));		// !�� ���� q�� �ƴ϶�� �ݺ��� �����ض��� ��
		System.out.println();
		System.out.println("���α׷� ����");
		sc.close();
	}

}
