

public class Day0206 {
	public static void main(String[] args) {
		char ch1 = 'a';	//���� 1���� �Է��ϴ� char���� ���� ����ǥ�� ���ξ� �մϴ�.
//		char ch2 = 'ab';	//char���� 2�� �̻��� ���ڸ� �Է��� �� �����ϴ�.
	//	char ch3 = '\n';	//escape���ڴ� ��ǻ�Ͱ� 1���� ���ڷ� �ν��մϴ�.
		char ch4 = 'b';		//char���� ���ڵ��� ������ �ѹ��� �����ϴ�.
		System.out.println(ch1);
		System.out.println(ch4);
		int result1 = ch1;	//char���� 2����Ʈ int���� 4����Ʈ�̹Ƿ� ch1�� int������ �ڵ�����ȯ
		System.out.println(result1);	//�ҹ��� 'a'�� 97
		int result2 = ch4;
		System.out.println(result2);	//�ҹ��� 'b'�� 98
		int result3 = 'z';
		System.out.println(result3);	//�ҹ��� 'z'�� 122
		int result4 = '1';
		System.out.println(result4);	//����'1'�� 49
		int result5 = '9';
		System.out.println(result5);	//����'9'�� 57
		int result6 = '0';
		System.out.println(result6);	//����'0'�� 48
		int result7 = '��';
		System.out.println(result7);	//�ѱ۵� ������ ��ȣ�� �ִ�.
		char result8 = 97;	//char���� ���ڵ� �Է��� �� �ִ�.
		System.out.println(result8);	//char���� ���ڸ� �����ϸ� �� ���ڿ� �´� ���ڰ� ���
		int result9 = 'A';
		System.out.println(result9);	//�빮�� 'A'�� 65
		char result10 = 'A' + 32;
		System.out.println(result10);	//�빮�ڿ� 32�� ���ϸ� �ҹ��ڰ� �ȴ�.
	}
}














