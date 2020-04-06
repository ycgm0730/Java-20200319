package Day17;

public interface RemoteControl { // �������̽����� �޼ҵ�� �ڵ������� �߻�޼ҵ�� �ν�
	// ����ʵ�
	public static int MAX_VOLUME = 10; // �������̽����� ����� �빮�ڷ� ������Ѵ�
	int MIN_VOLUME = 0;

	// �߻� �޼ҵ�
	abstract void turnOn();

	void turnOff();

	void setVolume(int volume);

	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���Ұ� ���·� �����մϴ�");
		} else {
			System.out.println("���Ұ� ���¸� �����մϴ�");
		}

	}

	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�");
	}

}
