import java.util.Scanner;

public class Day0502 {

public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	    
	System.out.print("����� ���� ������ �Է��� �ּ���(0~100): ");
    int score = sc.nextInt();
    String pass = "";
    
    if(score >= 90) {
       pass = "A����";
    } else if(score < 90 && score >= 80) {
   	   pass = "B����";
    } else if(score < 80 && score >= 70) {
       pass = "C����";
    } else if(score < 80 && score >= 70) {
	   pass = "C����";
    } else if(score < 70 && score >= 60) {
	   pass = "D����";
    } else {
	   pass = "F����";
    }
    
   System.out.println("������"+pass+"�ϼ̽��ϴ�");
   
   sc.close();
    
}

}

/*
* 90�� �̻��� A����
* 90�� �̸� 80�� �̻��� B����
* 80�� �̸� 70�� �̻��� C����
* 70�� �̸� 60�� �̻��� D����
* 60�� �̸� F����
*/
