package Day12;

public class StaticBlock {
	static String company = "�Ｚ";
	static String kind = "LCD";
	static String product = company + "-" + kind;
	static String pro2;

	static {
		pro2 = company + "-" + kind;	//�������� static block �ȿ��� �����ؾ��ߴ�
	}
}
