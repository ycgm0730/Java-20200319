package Day12;

import java.util.Scanner;

public class GradeEx {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("����, ����, ����, ������ 3���� �����Է�>>");
		int kor= sc.nextInt();
		int eng =sc.nextInt();
		int mat= sc.nextInt();
		Grade me= new Grade(kor,eng,mat);
		System.out.println("���:"+me.avg()); //avg()�� ����� ����Ͽ� ����
		
		sc.close();
				
	}
}
