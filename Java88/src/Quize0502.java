import java.util.Scanner;

public class Quize0502 {

	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		
		/*����Է�*/
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, �� �� �ϳ��� �����ϼ���(����=a, ����=b, ��=c");
		user = sc.next();
//		case "a":
//		case "A":
//			user = ga;
//			break;
		
	    if(user == "error") {
	    	System.out.println("�߸��Է��ϼ̽��ϴ� ���α׷��� �����մϴ�");
	    }
		/*��ǻ�ͼ���*/
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
