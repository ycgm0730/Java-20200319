package Day15;

import java.io.IOException;
import java.util.Scanner;

public class Ex7_2 {
	public static void main(String[] args) throws IOException{
		System.out.print("����� ���ڿ��� �Է��ϼ���");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println("�Է��� ���ڿ�:"+sb);
		
		//���ڿ� ������
		sb.reverse();
		System.out.println("������ ���ڿ�:"+sb);
		sc.close();
	}
}
