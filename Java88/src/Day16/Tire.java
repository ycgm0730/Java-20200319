package Day16;

public class Tire {
//�ʵ�
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accumilatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// �޼ҵ�
	public boolean roll() {
		++accumilatedRotation;
		if (accumilatedRotation < maxRotation) {
			System.out.println(location + "Tire����" + (maxRotation - accumilatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;
		}
	}

}