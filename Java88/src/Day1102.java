
public class Day1102 {
	public static void main(String[] args) {
		//0~9까지 배열을 출력한 후 초기화하여 출력
		int[] arr=new int[0];
		for(int i=0; i<10; i++) {
			arr[i] =i;
		}
		for(int number:arr) {
			System.out.println(number);
		}
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=0;
//		}
		arr=new int[10];
		
		for(int number:arr) {
			System.out.println(number);
		}
	}
}
