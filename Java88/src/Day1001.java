
public class Day1001 {
	public static void main(String[] args) {
		/*
		 * for���� ����Ͽ�
		 * a~z���� ����ϼ���
		 * 
		 * abcdefghijklnmopqrstuvwxyz
		 * ABCDEFGHIJKLNMOPQRSTUVWXYZ
		 * 
		 * ��Ʈ:�� ��ȯ�� �ʿ�
		 */
		for(int i='a'; i<='z'; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
}
