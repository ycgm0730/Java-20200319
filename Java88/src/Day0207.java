

import java.util.Random;
import java.util.Scanner;

public class Day0207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//��ĳ�� �ۼ����
		Random rd = new Random();	//Random�� �Ű�����(�Է°�)�� �����ϴ�.
		System.out.println(rd.nextInt());
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextGaussian());
		System.out.println(rd.nextInt(10));
		
		System.out.println(Math.random());	//0���� ũ�ų� ���� 1���� ���� �Ǽ��� ���
								//Math Ŭ������ �⺻���� Ŭ�����̹Ƿ� ����Ʈ�� �ʿ䰡 �����ϴ�.
		System.out.println(rd.nextDouble());
		sc.close();
	}
	
}
