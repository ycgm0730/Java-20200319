package Day12;

public class CarReturnEx {
	public static void main(String[] args) {

		CarReturn myCar = new CarReturn();

		myCar.SetGas(5);
		{
			if (myCar.isLeftGas()) {
				myCar.run();
			} else {
				System.out.println("가스를 충전하세요");
			}

		}
	}
}
//메소드는 return을 만나게 되면 값을 반환하고 작동을 정지한다