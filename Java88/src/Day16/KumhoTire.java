package Day16;

public class KumhoTire extends Tire {
	// �ʵ�

	// ������
	public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}

	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumilatedRotation;
		if(accumilatedRotation < maxRotation) {
			System.out.println(location+"KumhoTire ����:"+(maxRotation-accumilatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("****"+location+"KumhoTire��ũ****");
			return false;
		}
	}
}
