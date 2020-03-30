
public class Day1112 {
	public static void main(String[] args) {
		/*
		 * 2차원 배열을 사용하여 구구단을 완성하세요
		 * 출력도 중첩 for를 이용하세요
		 */
		int[][]arr= new int[8][9];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(i+2)*(j+1);
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print((i+2)+"x"+(j+1)+"="+arr[i][j]+"\t");
			}
			System.out.println();
		}
		int[][] ary= new int[10][10];
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j]=i*j;
			}
		}
		
		for(int i=2; i<ary.length; i++) {
			for(int j=1; j<ary[i].length; j++) {
				System.out.print(i+"x"+j+"="+ary[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
