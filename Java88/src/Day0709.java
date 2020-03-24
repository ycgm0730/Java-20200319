
public class Day0709 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i=1; i<=50; i++) {
			sum+=i;
		}
		double avg = sum /50.0; //sum 앞에 (double) 혹은 50.0 혹은 50f 입력시 소수점 까지 나옴
		System.out.println("1부터 50까지의 합의 평균:" +avg);
	}

}
