package Day12;

public class CarReturnEx {
	public static void main(String[] args) {

		CarReturn myCar = new CarReturn();

		myCar.SetGas(5);
		{
			if (myCar.isLeftGas()) {
				myCar.run();
			} else {
				System.out.println("������ �����ϼ���");
			}

		}
	}
}
//�޼ҵ�� return�� ������ �Ǹ� ���� ��ȯ�ϰ� �۵��� �����Ѵ�