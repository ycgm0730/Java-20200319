package Day15;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton s1;
//		s1= new Singleton(); //������ ȣ���� �Ұ����մϴ�
		s1 = Singleton.getInstance(); // ������ ������ ��ü�� ȣ���մϴ�

		Singleton s2 = Singleton.getInstance();

		if (s1 == s2) {
			System.out.println("���ϰ�ü");

		} else {
			System.out.println("�ٸ� ��ü");
		}

//		Member m1 = new Member("ȫ�浿", "hong");
//		Member m2 = new Member("ȫ�浿", "hong");
//		if (m1 == m2) {
//			System.out.println("���ϰ�ü");
//		} else {
//			System.out.println("�ٸ���ü");
//		}
	}
} 
