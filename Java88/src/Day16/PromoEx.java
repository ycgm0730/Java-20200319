package Day16;

public class PromoEx {
	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method();
		pc.method2();
		pc.method3();

		PromoParent pp = pc;// �ڽ��� �θ� ���԰��� (�ڵ�����ȯ)
		pp.method();
		pp.method2();
//		pp.method3();//�θ��� �����̱� ������ �θ𿡴� �޼ҵ�3�� ���� 

		pc = (PromoChild) pp; // �ڽĿ� �θ� �����Ҽ����� ��������ȯ�� ����
		pc.method();// �θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ���� �������� �ڽ� ��ü����߸� �մϴ�
		pc.method2();
		pc.method3();

		PromoParent pp2 = new PromoParent();
		if (pp2 instanceof PromoChild) {		// inttanceof�� ����ȯ�� �������� boolean������ ��ȯ�մϴ�
			pc = (PromoChild) pp2;				// ��������ȯ�� ������ ���·� ������ �����մϴ�
			pc.method3();
		} else {
			System.out.println("��������ȯ �Ҽ������ϴ�");
		}
	}
}
