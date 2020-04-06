package Day17;

public interface RemoteControl { // 인터페이스에서 메소드는 자동적으로 추상메소드로 인식
	// 상수필드
	public static int MAX_VOLUME = 10; // 인터페이스에서 상수는 대문자로 적어야한다
	int MIN_VOLUME = 0;

	// 추상 메소드
	abstract void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 상태로 설정합니다");
		} else {
			System.out.println("음소거 상태를 해제합니다");
		}

	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}

}
