package Day17;

public class CharAtEx {
	public static void main(String[] args) {
		String str = "Hello World!!!";
		char ch = str.charAt(4);
		System.out.println(ch);
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
