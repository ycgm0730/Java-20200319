package Day16;

public class PromoEx {
	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method();
		pc.method2();
		pc.method3();

		PromoParent pp = pc;// 자식은 부모에 대입가능 (자동형변환)
		pp.method();
		pp.method2();
//		pp.method3();//부모의 형태이기 때문에 부모에는 메소드3가 없음 

		pc = (PromoChild) pp; // 자식에 부모를 대입할수없음 강제형변환은 가능
		pc.method();// 부모의 객체가 자식의 객체에 대입될 때는 원래부터 자식 객체였어야만 합니다
		pc.method2();
		pc.method3();

		PromoParent pp2 = new PromoParent();
		if (pp2 instanceof PromoChild) {		// inttanceof는 형변환이 가능한지 boolean값으로 변환합니다
			pc = (PromoChild) pp2;				// 강제형변환은 원래의 형태로 복구만 가능합니다
			pc.method3();
		} else {
			System.out.println("강제형변환 할수없습니다");
		}
	}
}
