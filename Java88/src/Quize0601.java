import java.util.Scanner;

public class Quize0601 {
	public static void main(String[] args) {
		int intyear;
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader inbr = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Ǻ��� �⵵ �Է�!: ");
	//	intyear = Integer.parseInt(inbr.readLine());
		intyear = sc.nextInt();
		
		//�����Ǻ�
		if(intyear % 4 == 0 && intyear % 100 !=0 || intyear % 400==0) {
			System.out.println(intyear + "���� �����̴�.");
		}else{
			System.out.println(intyear +"���� ������ �ƴϴ�.");
		}
		
	}

}
