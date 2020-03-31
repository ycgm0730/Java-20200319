package Day15;

import java.io.IOException;
import java.util.Scanner;

public class Ex7_2 {
	public static void main(String[] args) throws IOException{
		System.out.print("출력할 문자열을 입력하세요");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println("입력한 문자열:"+sb);
		
		//문자열 리버싱
		sb.reverse();
		System.out.println("리버싱 문자열:"+sb);
		sc.close();
	}
}
