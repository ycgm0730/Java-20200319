

public class Day0211 {
	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A' + '1';	//A�� 65, 1�� 49
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str ="A" + "1";	//���ڿ��� �ƹ��͵� ���ų� �� ���� ���ڸ� �־
						//�ֵ���ǥ�� ���θ� ���ڿ��Դϴ�.
		System.out.println(str);	//���ڿ��� ������ �ϳ��� ���ڿ��� ��ġ�� �˴ϴ�.
		String str2 = "10";
		int num2 = 10;
		String res2 = str2 + num2;	//���ڿ��� �ٸ� �ڷ����� ��ġ�� �Ǹ� �ϳ��� ���ڿ��� �˴ϴ�.
		System.out.println(res2);
		
		int num3 = 10;
		int num4 = 20;	//int�� integer�� ����Դϴ�.
		System.out.println(num3 + "" + num4);	//���ڸ� ���ڷ� �����ϴ� ���1
	//	String str3 = String.valueOf(num3);		//���ڸ� ���ڷ� �����ϴ� ���2
		
		String str4 = "100";
		System.out.println(str4 + 100);
		
//		int num5 = Integer.valueOf(str4);
//		double d1 = Double.valueOf(str4);
		
//		int num6 = Integer.parseInt(str4);
//		double d2 = Double.parseDouble(str4);
		
		String str5 ="Hello";
//		int num7 = Integer.valueOf(str5);
		int num7 = Integer.parseInt(str5);
		System.out.println(num7);
		
	}
}












