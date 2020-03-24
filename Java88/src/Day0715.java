
public class Day0715 {
	public static void main(String[] args) {
		/* 1~100 중에 5의 배수의 합을 출력하세요 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;

			}
			System.out.println(sum);

			/* 1~50 중에 3의 배수는 화면에 출력하세요 */

			for (int i1 = 1; i1 <= 50; i1++) {
				if (i1 % 3 == 0) {

					System.out.println(i1);
				}
			}

			/* 1~50중에 3의 배수의 총합과 개수를 출력하세요 */
			sum = 0;
			int cnt=0;
			for(int i2=1; i2<=50; i2++) {
				if(i2%3==0) {
					sum+=i2;
					cnt++;
				}
			}
			System.out.println("총합:"+sum+",개수:"+cnt);

		}
	}
}