import java.util.Scanner;

public class Quize0601 {
	public static void main(String[] args) {
		int intyear;
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader inbr = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년을 판별할 년도 입력!: ");
	//	intyear = Integer.parseInt(inbr.readLine());
		intyear = sc.nextInt();
		
		//윤년판별
		if(intyear % 4 == 0 && intyear % 100 !=0 || intyear % 400==0) {
			System.out.println(intyear + "년은 윤년이다.");
		}else{
			System.out.println(intyear +"년은 윤년이 아니다.");
		}
		
	}

}
