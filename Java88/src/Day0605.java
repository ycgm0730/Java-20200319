
public class Day0605 {
	public static void main(String[] args) {
		System.out.println("������ ���");
		for(int i = 1; i<= 9; i++) {
			//System.out.println(i+ "��");
			for(int j = 2; j<=9; j++) {
				System.out.print(j + "x"+ i +"=" + (i*j) +"\t"); 
			}
			System.out.println();
		}
	}

}
