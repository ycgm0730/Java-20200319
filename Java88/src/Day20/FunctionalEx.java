package Day20;

public class FunctionalEx {

	public static void main(String[] args) {
		MyFunctionalInterface f1 = new MyFunctionalInterface() {

			@Override
			public void method() {
				System.out.println("�͸�����ü�� �޼ҵ� ȣ��");

			}
		};
		f1.method();

		MyFunctionalInterface f2 = () -> {
			System.out.println("f2���ٽ����� �޼ҵ� ȣ��");
		};
		f2.method();

		MyFunctionalInterface f3 = () -> System.out.println("f3���ٽ����� �޼ҵ� ȣ��");
		f3.method();

	}

}
