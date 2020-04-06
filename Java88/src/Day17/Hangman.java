package Day17;

import java.util.Scanner;

public class Hangman {
	private String hiddenString;// ����
	private StringBuffer outputString;// ȭ�����
	private StringBuffer inputString;// �Է��� ����
	private int remainder;// ���� ���� ��
	private int failed;// Ʋ��Ƚ��
	private Scanner sc;
	private String inputData;

	public Hangman() {
		hiddenString = " hello";// ���� �ʱ�ȭ

		/* �ʱ�ȭ �ڵ� �߰� */
		outputString = new StringBuffer();
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
	}

	public Hangman(String solution) {
		hiddenString = solution;// ���� �ʱ�ȭ

		/* �ʱ�ȭ �ڵ� �߰� */
		outputString = new StringBuffer();
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for (int i = 0; i < remainder; i++) {
			outputString.append("_");
		}
	}

	public void playGame() {
		System.out.println("��� ������ �����մϴ�");
		show();
		do {
			do {
				setInputData();
			} while (checkChar(inputData));
			processGame();
			show();
		} while (failed < 6 && remainder > 0);
		System.out.println("��� ������ �����մϴ�");
	}

	private void show() {
		System.out.println("Ʋ�� ȹ��:" + failed + "/6");
		System.out.println(outputString);
	}

	public void setInputData() {
		System.out.print("���ڸ� �Է��� �ּ���:");
		this.inputData = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputData) {
		if (inputString.indexOf(inputData) == -1) {
			inputString.append(inputData);
			return false;
		}
		System.out.println("�̹� �Է��� �����Դϴ�");
		return true;
	}

	private void processGame() {
		if (hiddenString.indexOf(inputData) == -1) {
			failed++;
		} else {
			int index = hiddenString.indexOf(inputData);
			do {
				outputString.setCharAt(index, inputData.charAt(0));
				remainder--;
				index = hiddenString.indexOf(inputData, index + 1);
			} while (index != -1);
		}
	}
}
