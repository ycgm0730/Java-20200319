
public class Day506 {

	public static void main(String[] args) {
	 System.out.println("�ֻ��� ������ �����մϴ�");
	 int dice = (int) Math.random() *6 +1;
	 System.out.println("�ֻ����� �����ϴ�");
	 
//	 if (dice == 1) {
//		 System.out.println("�ֻ����� ������ 1�Դϴ�");
//	 }else if (dice == 2) {
//		 System.out.println("�ֻ����� ������ 2�Դϴ�");
//	 }else if (dice == 3) {
//		 System.out.println("�ֻ����� ������ 3�Դϴ�");
//	 }else if (dice == 4) {
//		 System.out.println("�ֻ����� ������ 4�Դϴ�");
//	 }else if (dice == 5) {
//		 System.out.println("�ֻ����� ������ 5�Դϴ�");
//	 }else if (dice == 6) {
//		 System.out.println("�ֻ����� ������ 6�Դϴ�");
//	 }
	 
	 switch(dice) {
	 case 1:
	     System.out.println("�ֻ����� ������ 1�Դϴ�");
	     break;
	 case 2:
		 System.out.println("�ֻ����� ������ 2�Դϴ�");
		 break;              
	 case 3:                 
		 System.out.println("�ֻ����� ������ 3�Դϴ�");
		 break;              
	 case 4:                 
		 System.out.println("�ֻ����� ������ 4�Դϴ�");
		 break;              
	 case 5:                 
		 System.out.println("�ֻ����� ������ 5�Դϴ�");
		 break;             
	 case 6:                
		 System.out.println("�ֻ����� ������ 6�Դϴ�");
		 
	 }
	 System.out.println("������ �����մϴ�");
  }

}
