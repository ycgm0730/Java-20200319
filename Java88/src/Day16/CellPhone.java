package Day16;

public class CellPhone {
	//�ʵ�
	String model ="model";
	String color="color";
	
	//������
	
	//�޼ҵ�
	void powerOn() {System.out.println("������ �մϴ�");}
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�");}
	void sendVoice(String message) {System.out.println("�ڱ�:"+ message);}
	void receveVoice(String message) {System.out.println("����:"+ message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}
}
