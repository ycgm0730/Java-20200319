

public class Day0306 {
	public static void main(String[] args) {
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = true;
		boolean var4 = false;
		
		System.out.println(var1 && var2);	//true && false
		System.out.println(var2 && var3);	//false && true
		System.out.println(var1 && var3);	//true && true
		System.out.println(var2 && var4);	//false && false
		System.out.println();

		System.out.println(var1 || var2);	//true || false
		System.out.println(var2 || var3);	//false || true
		System.out.println(var1 || var3);	//true || true
		System.out.println(var2 || var4);	//false || false
		System.out.println();
		
		System.out.println(!var1);
		System.out.println(!var2);
		
		boolean light = false;
		System.out.println("���ĵ��� ������ ��������? " + light);
		light = !light;
		System.out.println("���ĵ��� ������ ��������? " + light);
		light = !light;
		System.out.println("���ĵ��� ������ ��������? " + light);
		light = !light;
		System.out.println("���ĵ��� ������ ��������? " + light);
	}
}














