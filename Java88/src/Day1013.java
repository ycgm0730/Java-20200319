import java.util.Scanner;

public class Day1013 {
	public static void main(String[] args) {
		System.out.println("5���� ������ �Է¹޾� �ִ밪�� ���ϴ� ���α׷�");
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+"��° ������ �Է��ϼ���");
			arr[i] =sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(max<num) {
				
			}
		}
		System.out.println("�ִ밪:"+max);
		sc.close();
	}
}
