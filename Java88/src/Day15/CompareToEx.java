package Day15;

public class CompareToEx {

	public static void main(String[] args) {
		String a= "aaa";
		String b= "Abc";
		int res1 = a.compareTo(b);
		System.out.println("비교결과:"+res1);
		
		String c= "Java Programming Very Good";
		String d= "Java Programming";
		
		boolean compare1 = c.regionMatches(false, 5, d, 5, 1);
		boolean compare2 = c.regionMatches(true, 0, d, 0, 4);
		boolean compare3 = c.regionMatches(false, 5, d, 0, 4);

		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
	}

}
