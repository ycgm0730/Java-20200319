package Day15;

import java.util.StringTokenizer;

public class TokenEx {

	public static void main(String[] args) {
	 	String now = "2020/03/31";
	 	
	 	StringTokenizer st = new StringTokenizer(now, "/");
	 	
	 	int cnt = st.countTokens();
	 	System.out.println("���� ��ū��" +cnt);
	 	
	 	while(st.hasMoreTokens()) {
	 		String temp =st.nextToken();
	 		System.out.println(temp);
	 	}
	 	
	 	String[] arr =now.split("/");
	 	for(String str :arr) {
	 		System.out.println(str);
	 	}
	}

}
