
public class Day0715 {
	public static void main(String[] args) {
		/* 1~100 �߿� 5�� ����� ���� ����ϼ��� */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;

			}
			System.out.println(sum);

			/* 1~50 �߿� 3�� ����� ȭ�鿡 ����ϼ��� */

			for (int i1 = 1; i1 <= 50; i1++) {
				if (i1 % 3 == 0) {

					System.out.println(i1);
				}
			}

			/* 1~50�߿� 3�� ����� ���հ� ������ ����ϼ��� */
			sum = 0;
			int cnt=0;
			for(int i2=1; i2<=50; i2++) {
				if(i2%3==0) {
					sum+=i2;
					cnt++;
				}
			}
			System.out.println("����:"+sum+",����:"+cnt);

		}
	}
}