
public class Day0611 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; //continue�� ���� �����ϰ� �ִ� �ݺ��� �Ѿ�°� break�� ���� �����ϰ� �ִ� �ݺ����� �ϼ��Ѵ�
			}
			System.out.println(i);
		}

	}
}
