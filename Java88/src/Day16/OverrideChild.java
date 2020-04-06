package Day16;

public class OverrideChild extends OverrideParent {
	void method3() {
		System.out.println("자식 메서드 3");
	}
	@Override
	void method2() {
		System.out.println("자식 메서드2");
	}
}
