

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chapter02Q01 {
	public static void main(String[] args) throws Exception {
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�⵵�� �Է��ϼ���! : ");
		number = Integer.parseInt(inbr.readLine());
		System.out.println("�Է��� �⵵�� " + number + "�� �Դϴ�.");
		inbr.close();
	}
}
