import java.util.Scanner;

public class Day1015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int kim =2000;
		final int dd=2000;
		final int od=500;
		final int sun=2000;
		int a, b, c, d;
		System.out.println("메뉴");
		System.out.println("김밥1줄:2000원");
		System.out.println("떡볶이 1인분:2000원");
		System.out.println("오뎅1개:500원");
		System.out.println("순대1인분:2000원");
		System.out.println();
		
		System.out.print("김밥은 몇 줄 구매하시겠습니까?");
		a =sc.nextInt();
		System.out.print("떡볶이는 몇 인분 구매하시겠습니까?");
		b =sc.nextInt();
		System.out.print("오뎅은 몇 개 구매하시겠습니까?");
		c =sc.nextInt();
		System.out.print("순대는 몇 인분 구매하시겠습니까?");
		d =sc.nextInt();
		System.out.println();
		
		
		System.out.println("김밥 "+ a + "줄 주문하셨습니다");
		System.out.println("김밥:"+ kim*a+"원");
		System.out.println("떡볶이 "+ b + "인분 주문하셨습니다");
		System.out.println("떡볶이:"+ dd*b+"원");
		System.out.println("오뎅 "+ c + "줄 주문하셨습니다");
		System.out.println("오뎅:"+ od*c+"원");
		System.out.println("순대 "+ d + "줄 주문하셨습니다");
		System.out.println("순대:"+ sun*d+"원");
	//	System.out.println("총 금액"+);
		sc.close();
	}
}
