package Day17;

public class IndexOfEx {
	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		int index = str.indexOf("����");
		System.out.println(index);
		index = str.indexOf("C���");
		System.out.println(index);
		str = "�ڹ��ڹ��ڹ� �������� �׷��������Դϴ�";
		index = str.indexOf("��");//�Ű������� �� ���� ��쿡�� 0������ �˻�
		System.out.println(index);
		index = str.indexOf("��",index +1);//ù��° �Ű�����: �˻���, 2��° �Ű�����: �˻� ���� ��ġ
		System.out.println(index);
		index = str.indexOf("��",index +1);
		System.out.println(index);
		index = str.indexOf("��",index +1);
		System.out.println(index);
		String str2 =str.replace("��������", "����");
		System.out.println(str);
		System.out.println(str2);
		String str3 = str.replace("�ڹ�", "java");
		System.out.println(str3);
	}
}
