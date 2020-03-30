package Day12;

public class Car { // Car.java는 public이여야 한다
	/* 필드 */
	public static void/*리턴타입*/ main(String[] args) {
	}

	String company = "기아자동차";
	String model = "쏘울";
	String color = "은색";
	int maxSpeed = 250;
	int speed = 100;

	/* 생성자 */
	Car() { // 생성자를 생성하지 않으면 기본생성자가 자동으로 작성됩니다.

	}

	Car(String com, String col, int max) {
		this.company = com;
		this.color = col;
		this.maxSpeed = max;
	}

	Car(String company, int maxSpeed, String color) {
		this.company = "기아자동차";
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String color, int maxSpeed){
	//	this.(String company, int maxSpeed, String color);
	

	}

	
	
	Car(String color, int speed, int maxSpeed){
		
	}
	
	Car(String company, String color, int maxSpeed, int speed){
		
	}
	
	Car(int maxSpeed, String company, String color ){ //자료의 유형이 다르거나 생성자가 달라야지만 중복생성자로 사용할수있다
			//생성자는 overoding 할수있다:중복정의	
//		리턴타입=무관 
//		메소드 이름 동일 
//		매개변수의 타입 개수 순서가 달라야함
		//매개변수의 수(크기)를 모를때 배열을 사용하거나 (...)을 사용가능
	}
	/*메소드(메서드)*/
	void accel() {
		speed +=10;
		if(speed> maxSpeed) {
			speed=maxSpeed;
		}
		System.out.println("현재 속도:"+speed);
	}
	void brake(){
		speed=0;
		System.out.println("현재 속도:"+speed);
	}
	
}
