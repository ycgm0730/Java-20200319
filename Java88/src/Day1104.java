
public class Day1104 {
	public static void main(String[] args) {
		/*
		 * 2차원 배열을 이용하여 아래와 같이 입력하세요
		 * 
		 * 1 2 3 4 5 6 7 14 13 12 11 10 9 8 15 16 17 18 19 20 26 25 24 23 22 21 17 18 19
		 * 30 31 32 38 37 36 35 34 33
		 */

		int[][] arr = new int[5][7];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = cnt;
					cnt++;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = cnt;
					cnt++;
				}
//		for(int i=0; i<arr.length; i++) {
//			
			}

		}
	}
}
