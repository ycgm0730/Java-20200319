
public class Day1006 {
	public static void main(String[] args) {
//		int[] arr1= {10,20,30,40,50};
//		arr1 = {100,200,300,400,500};
		
		int[]arr2=new int[5];// 0,0,0,0,0
		//arr2= {10,20,30,40,50};
		System.out.println(arr2);
		
		int[]arr3=new int[] {10,20,30,40,50};//ũ�Ⱑ 5�� �迭
//		arr3= {100,200,300,400,500}; //�߰�ȣ �ʱ�ȭ�� ����� 1���� ��밡���ϴ�
		
		String str1="�ȳ��ϼ���";
		str1="hello"; //������ ������ �ٸ� ��ü�� ������ �� �ִ�
		System.out.println(str1);
		
		arr3=new int[] {100,200,300,400,500,};//�迭�� ������ ������ �ٸ� ��ü�� ������ �� �ִ�
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		arr2= new int[10];//�ٸ� ��ü�� ��ȯ�� �����մϴ�
		
		String str= "�ȳ��ϼ���";
		System.out.println(str.length());
		
	}
}
