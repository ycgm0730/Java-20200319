package Day16;

public class HankookTire extends Tire{
	//�ʵ�
	
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumilatedRotation;
		if(accumilatedRotation < maxRotation) {
			System.out.println(location+"HankookTire ����:"+(maxRotation-accumilatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("****"+location+"HankookTire��ũ****");
			return false;
		}
	}
}
