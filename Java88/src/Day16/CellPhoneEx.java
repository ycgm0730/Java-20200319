package Day16;

public class CellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("������S20", "����", 10);
		dcp.powerOn(); // �θ��� �޼ҵ�
		dcp.bell(); // �θ��� �޼ҵ�
		dcp.sendVoice("��������");// �θ��� �޼ҵ�
		dcp.receveVoice("�ù��Դϴ�");// �θ��� �޼ҵ�
		dcp.sendVoice("���տ�");// �θ��� �޼ҵ�
		dcp.receveVoice("����");// �θ��� �޼ҵ�
		dcp.hangUp();// �θ��� �޼ҵ�
		dcp.turnOnDmb();// �ڽ��� �޼ҵ�
		dcp.setChannel(100);// �ڽ��� �޼ҵ�
		dcp.turnOffDmb();// �ڽ��� �޼ҵ�
		dcp.powerOff();// �θ��� �޼ҵ�
		
		CellPhone cp= new CellPhone();
		cp.powerOn();
	//	cp.turnOnDmb();//�θ��� ��ü�� �ڽ��� �ν��Ͻ� ����� ȣ���Ҽ� �����ϴ�
		cp.powerOff();
	}
}
