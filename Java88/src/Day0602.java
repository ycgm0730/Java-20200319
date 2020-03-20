
public class Day0602 {

	public static void main(String[] args) {
		
		int sum = 0;
//		int i = 0;
		
		for(int index=1; index<=100; index +=1 ) { //index ++1 과 index + 1 과 index +=1과 같다
			sum += index; //내부 선언              //필요해 의해 다른 수식도 사용할수 있다
		}
		
		System.out.println("1붜 100까지의 합:"+ sum);
//		System.out.println("현재 i의 값:"+ i);

	}

}
