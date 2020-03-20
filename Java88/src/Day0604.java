
public class Day0604 {
	public static void main(String[] args) {
		int i, j , k;
		for( i=0; i<3; i++) {
			for( j =0; j<5; j++) {       //내부에서 외부 i값을 중첩해서 사용하면 내부에서 5로 계산된것이 
				System.out.print("*");   //i값이 6이 되어 외부 수식이 거짓으로 출력되어 종료된다
			}
			System.out.println();
		}
		for(i=0; i<3; i++) {
			System.out.println("안녕하세요"); //같은 동의선 상에서 사용할때는 i를 사용해도 괜찮다
		}
	}

}
