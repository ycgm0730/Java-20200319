package Day17;

public class Audio implements RemoteControl {

	int volume;

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		this.volume = volume;
		System.out.println("������" + this.volume + "���� �����մϴ�");
	}

	@Override
	public void setMute(boolean mute) {
		if (mute)
			System.out.println("������� ���Ұ� ���·� �����մϴ�");
		else
			System.out.println("������� ���Ұ� ���¸� �����մϴ�");
	}

}
