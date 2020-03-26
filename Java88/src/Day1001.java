
public class Day1001 {
	public static void main(String[] args) {
		/*
		 * for문을 사용하여
		 * a~z까지 출력하세요
		 * 
		 * abcdefghijklnmopqrstuvwxyz
		 * ABCDEFGHIJKLNMOPQRSTUVWXYZ
		 * 
		 * 힌트:형 변환이 필요
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
