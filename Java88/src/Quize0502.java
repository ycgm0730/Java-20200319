import java.util.Scanner;

public class Quize0502 {

	public static void main(String[] args) {
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String user = "";
		String com = "";
		
		/*사람입력*/
		Scanner sc = new Scanner(System.in);
		System.out.print("가위, 바위, 보 중 하나를 선택하세여(가위=a, 바위=b, 보=c");
		user = sc.next();
//		case "a":
//		case "A":
//			user = ga;
//			break;
		
	    if(user == "error") {
	    	System.out.println("잘못입력하셨습니다 프로그램을 종료합니다");
	    }
		/*컴퓨터설정*/
		int number = (int)(Math.random()*3);
		switch(number) {
		case 0:
			com =ga;
			break;
		case 1:
			com=ba;
			break;
		case 2:
			com=bo;
			break;
		}
		
		if((user.equals(bo)&& com.equals(ba))||(user.equals(ga) && com ==bo)||(user.equals(bo) &&com==ga));
		
	 
		 
		
	}

}
