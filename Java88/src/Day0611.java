
public class Day0611 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; //continue는 현재 실행하고 있는 반복을 넘어가는것 break는 현재 실행하고 있는 반복문을 완성한다
			}
			System.out.println(i);
		}

	}
}
