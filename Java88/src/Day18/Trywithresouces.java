package Day18;

import java.io.File;
import java.util.Scanner;

public class Trywithresouces {
	public void getData(String file) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.out.println("¿¹¿Ü");
			System.out.println();
			e.getStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

	public static void main(String[] args) {
		Trywithresouces twr = new Trywithresouces();
		twr.getData("test.txt");
	}
}
