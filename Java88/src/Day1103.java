
public class Day1103 {
	public static void main(String[] args) {
		/*
		ó�� �� ���� �迭 ��Ҹ� �ʱ�ȭ�� ���¿���
		������ �迭 ��Ҵ� ���� ��� ��Ģ�� ���� ä���
		�迭�� ����ϼ���
		int arr[10]={1,2};
		����°��� = ù��° ���+�ι�° ���
		����° ���= ������° ���+ ��ȩ��°���
		*/
		
		
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		
		for(int i=2; i<arr.length; i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		for(int num:arr) {
			System.out.println(num);
		}
	}
}
