import java.util.Scanner;

public class Day1015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int kim =2000;
		final int dd=2000;
		final int od=500;
		final int sun=2000;
		int a, b, c, d;
		System.out.println("�޴�");
		System.out.println("���1��:2000��");
		System.out.println("������ 1�κ�:2000��");
		System.out.println("����1��:500��");
		System.out.println("����1�κ�:2000��");
		System.out.println();
		
		System.out.print("����� �� �� �����Ͻðڽ��ϱ�?");
		a =sc.nextInt();
		System.out.print("�����̴� �� �κ� �����Ͻðڽ��ϱ�?");
		b =sc.nextInt();
		System.out.print("������ �� �� �����Ͻðڽ��ϱ�?");
		c =sc.nextInt();
		System.out.print("����� �� �κ� �����Ͻðڽ��ϱ�?");
		d =sc.nextInt();
		System.out.println();
		
		
		System.out.println("��� "+ a + "�� �ֹ��ϼ̽��ϴ�");
		System.out.println("���:"+ kim*a+"��");
		System.out.println("������ "+ b + "�κ� �ֹ��ϼ̽��ϴ�");
		System.out.println("������:"+ dd*b+"��");
		System.out.println("���� "+ c + "�� �ֹ��ϼ̽��ϴ�");
		System.out.println("����:"+ od*c+"��");
		System.out.println("���� "+ d + "�� �ֹ��ϼ̽��ϴ�");
		System.out.println("����:"+ sun*d+"��");
	//	System.out.println("�� �ݾ�"+);
		sc.close();
	}
}
