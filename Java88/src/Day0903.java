
public class Day0903 {
	public static void main(String[] args) {
		/*
		 * 1부터 25까지 5칸 5줄로 출력하세요
		 */
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		int cnt = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(cnt + "\t");
				cnt++;
			}
			System.out.println();
		}
		System.out.println();
		
		int cnt1 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%2d",cnt1);
				cnt1++;
			}
			System.out.println();
		}
		System.out.println();
		
		
		int cnt2 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%02d",cnt2);
				cnt2++;
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i%2==0) {
					System.out.print((i*5)+j+1+"\t");
				}else {
					System.out.print((i+1)*5-j+"\t");
				}
			}
			System.out.println();
		}
		
		/*
		 * @
		 *  @
		 *   @
		 *    @
		 *     @
		 */
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j) {
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
/*
 * System.out.printf()는 형식 (format)에 맞게 출력하는 메소드 입니다
 * printf는 C언어에서 출력으로 사용하는 메소드인데 자바에서도 사용할수 있습니다
 * 두 번째 부터는 출력형식에 대입할 변수를 입력합니다
 * 
 * 혁식의 시작은 %로 시작합니다
 * d: decimal 10진수
 * f: float 실수
 * lf: long float -> double 실수   	//C언어용 자바에 없음
 * o: octa 8진수
 * x: hexa 16진수
 * b: binary 2진수
 * s: String 문자열
 * c: char 문자 1개
 * 
 * 조합할 수 있는 것
 * 앞쪽에 숫자를 입력하면 자리수를 뜻함
 * %2d->십진수로 2자리 출력, %10d -> 십진수로 10자리 출력
 * 숫자 앞에 0을 붙이면 빈 공간을 0으로 채웁니다 다른 문자는 사용할 수 없습니다
 * 제일 앞쪽에 -를 붙이면 좌측 정렬합니다 (%-3d)
  */
