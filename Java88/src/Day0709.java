
public class Day0709 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i=1; i<=50; i++) {
			sum+=i;
		}
		double avg = sum /50.0; //sum �տ� (double) Ȥ�� 50.0 Ȥ�� 50f �Է½� �Ҽ��� ���� ����
		System.out.println("1���� 50������ ���� ���:" +avg);
	}

}
