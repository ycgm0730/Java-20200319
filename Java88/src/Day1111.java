import java.util.Scanner;

public class Day1111 {
	public static void main(String[] args) {
		/*
		 * ��ǰ �ܰ��� ������ �Է� �޾� ���� �ݾװ� �������� ����ϼ���
		 * ��³���: ��ǰ�ܰ�, ��ǰ����, ���ұݾ�, ������
		 * 
		 * ����
		 * 1. �� ��ǰ ���� �ݾ��� 50���� �̻��϶�30%, 100���� �̻��� ��40 %
		 * 2. ���� �ݾ��� "���ε� ��ǰ �ܰ�*����" ���� ��� 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		int price = sc.nextInt();
		System.out.print("������ �Է��ϼ���");
		int amo= sc.nextInt();
		int res1= price*amo;
		System.out.println("��ǰ�ܰ�:"+price+"��");
		System.out.println("��ǰ����:"+amo+"��");
		int sale=0;
		if(res1>=1_000_000) {
			price*= 0.6;
			sale=40;
		}else if(res1>=500_000) {
			price*=0.7;
			sale=30;
		}
		System.out.println("������:"+sale+"%");
		System.out.println("���ұݾ�:"+price*amo+"��");
		sc.close();
	}
}
