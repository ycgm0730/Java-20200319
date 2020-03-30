import java.util.Arrays;

public class Day1105 {
	public static void main(String[] args) {
		/*
		 * 1. 1~45를 입력한 배열을 작성합니다 2. 작성하 배열을 무작위로 섞습니다 3. 0인덱스부터 5인덱스까지 출력합니다
		 */
		int[] arr = new int[45];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		for (int i = 0; i < 10_000; i++) {
			int r = (int) (Math.random() * 45);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		System.out.println("로또 추첨기");
		int[] ary = Arrays.copyOf(arr, 6);
		Arrays.sort(ary);
		System.out.println("당첨번호:");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(", 보너스 번호:" + ary[6]);
	}
}
