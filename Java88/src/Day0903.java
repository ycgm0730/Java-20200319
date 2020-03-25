
public class Day0903 {
	public static void main(String[] args) {
		/*
		 * 1���� 25���� 5ĭ 5�ٷ� ����ϼ���
		 */
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		int cnt = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(cnt + "\t");
				cnt++;
			}
			System.out.println();
		}
		System.out.println();
		
		int cnt1 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%2d",cnt1);
				cnt1++;
			}
			System.out.println();
		}
		System.out.println();
		
		
		int cnt2 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%02d",cnt2);
				cnt2++;
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i%2==0) {
					System.out.print((i*5)+j+1+"\t");
				}else {
					System.out.print((i+1)*5-j+"\t");
				}
			}
			System.out.println();
		}
		
		/*
		 * @
		 *  @
		 *   @
		 *    @
		 *     @
		 */
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j) {
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
/*
 * System.out.printf()�� ���� (format)�� �°� ����ϴ� �޼ҵ� �Դϴ�
 * printf�� C���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����Ҽ� �ֽ��ϴ�
 * �� ��° ���ʹ� ������Ŀ� ������ ������ �Է��մϴ�
 * 
 * ������ ������ %�� �����մϴ�
 * d: decimal 10����
 * f: float �Ǽ�
 * lf: long float -> double �Ǽ�   	//C���� �ڹٿ� ����
 * o: octa 8����
 * x: hexa 16����
 * b: binary 2����
 * s: String ���ڿ�
 * c: char ���� 1��
 * 
 * ������ �� �ִ� ��
 * ���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ����
 * %2d->�������� 2�ڸ� ���, %10d -> �������� 10�ڸ� ���
 * ���� �տ� 0�� ���̸� �� ������ 0���� ä��ϴ� �ٸ� ���ڴ� ����� �� �����ϴ�
 * ���� ���ʿ� -�� ���̸� ���� �����մϴ� (%-3d)
  */
