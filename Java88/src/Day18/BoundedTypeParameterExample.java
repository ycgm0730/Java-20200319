package Day18;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
//		String str;
		//String str= Util.compare("a","b"); //(x)
		
		int result1 = Util./*<Integer>*/compare(10, 20);	//t1 �� t2 �� int �̹Ƿ� Integer �� ���߰� ����
		System.out.println(result1);	// -1
		
		int result2= Util./*<Number>*/compare(4.5, 3);	//t1�� double, t2 �� int
		System.out.println(result2);	//1
		
		int result3 =Util.compare(100, 100);
		System.out.println(result3);
	}

}
