
public class Day1012 {
	public static void main(String[] args) {
		int[]arr= new int[100000000];
		int sum=0;
		int sum2=0;
		
		System.out.println("C�� for��");// Ư�� �����͸� ����Ұ��
		
		long sTime1= System.currentTimeMillis();
		for(int i=0; i<arr.length; i++) {
			sum+=i;
		}
		long eTime1=System.currentTimeMillis();
		System.out.println(eTime1-sTime1);
		System.out.println();
		
		System.out.println("���� for��");//��� �����͸� ����Ұ��
		long sTime2=System.currentTimeMillis();
		for(int num:arr) {
			sum2+=num;
		}
		long eTime2=System.currentTimeMillis();
		System.out.println(eTime2-sTime2);
	}
}
