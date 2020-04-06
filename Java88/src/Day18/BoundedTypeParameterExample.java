package Day18;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
//		String str;
		//String str= Util.compare("a","b"); //(x)
		
		int result1 = Util./*<Integer>*/compare(10, 20);	//t1 과 t2 가 int 이므로 Integer 로 유추가 가능
		System.out.println(result1);	// -1
		
		int result2= Util./*<Number>*/compare(4.5, 3);	//t1은 double, t2 는 int
		System.out.println(result2);	//1
		
		int result3 =Util.compare(100, 100);
		System.out.println(result3);
	}

}
