import java.util.Scanner;

public class Day1111 {
	public static void main(String[] args) {
		/*
		 * 상품 단가와 수량을 입력 받아 지불 금액과 할인율을 출력하세요
		 * 출력내용: 상품단가, 상품수량, 지불금액, 할인율
		 * 
		 * 조건
		 * 1. 총 상품 구입 금액이 50만원 이상일때30%, 100만원 이상일 때40 %
		 * 2. 지불 금액은 "할인된 상품 단가*수량" 으로 계산 
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("가격을 입력하세요");
		int price = sc.nextInt();
		System.out.print("수량을 입력하세요");
		int amo= sc.nextInt();
		int res1= price*amo;
		System.out.println("상품단가:"+price+"원");
		System.out.println("상품수량:"+amo+"개");
		int sale=0;
		if(res1>=1_000_000) {
			price*= 0.6;
			sale=40;
		}else if(res1>=500_000) {
			price*=0.7;
			sale=30;
		}
		System.out.println("할인율:"+sale+"%");
		System.out.println("지불금액:"+price*amo+"원");
		sc.close();
	}
}
