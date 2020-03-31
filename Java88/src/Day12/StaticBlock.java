package Day12;

public class StaticBlock {
	static String company = "삼성";
	static String kind = "LCD";
	static String product = company + "-" + kind;
	static String pro2;

	static {
		pro2 = company + "-" + kind;	//예전에는 static block 안에서 연산해야했다
	}
}
