
public class Day0801 {
	public static void main(String[] args) {
		/* 1~ 100��� */
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		/* 1~100 �߿� 3�� 5�� ������ ���� ���ΰ���? */

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				sum += i;
			}
		}
		System.out.println("3�� 5�� ������� ��:"+sum);
		
		/*1~100 �߿� ¦���� ���ϰ� Ȧ���� �� ����� ����ϼ��� */
		
		int res1=0;
		int res2=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				res1+= i;
			}else {
				res2 +=i;
			}
		}
		System.out.println("¦���� ���ϰ� Ȧ���� �����:"+(res1-res2));
		
		int num =0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				num+= i;
			}else {
				num-=i;
			}
		}
		System.out.println("¦���� ���ϰ� Ȧ���� �����:"+(num-num));
	}

}
