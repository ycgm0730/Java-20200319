package Day20;

public class FunctionalEx {

	public static void main(String[] args) {
		MyFunctionalInterface f1 = new MyFunctionalInterface() {

			@Override
			public void method() {
				System.out.println("익명구현객체로 메소드 호출");

			}
		};
		f1.method();

		MyFunctionalInterface f2 = () -> {
			System.out.println("f2람다식으로 메소드 호출");
		};
		f2.method();

		MyFunctionalInterface f3 = () -> System.out.println("f3람다식으로 메소드 호출");
		f3.method();

	}

}
