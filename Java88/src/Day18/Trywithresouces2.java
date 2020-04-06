package Day18;

import java.io.File;
import java.util.Scanner;

public class Trywithresouces2 {
	public void getData(String file) {
		try (Scanner sc = new Scanner(new File(file)); 
				Scanner sc2 = new Scanner(System.in);	//���� ���� �ڵ� ���� �ҽ��� �ۼ��Ҽ��ִ�
				) {

			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.out.println("����");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.getStackTrace();
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Trywithresouces2 twr = new Trywithresouces2();
		twr.getData("test.txt");
	}
}
