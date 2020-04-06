package Day18;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		exceptionTest();
	}

	static void exceptionTest() {

		int[] arr = new int[3];
		try {
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();// 강제적으로 예외를 발생시키려면 객체를 생성해서 throw해야합니다

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자 연산이 불가능하거나 배열의 범위를 벗어났습니다");
		} catch (Exception e) {
			System.out.println("발생된 모든 예외를 처리합니다");
			e.printStackTrace();
		}finally {//예외와 상관없이 무조건 실행하는 구간입니다 생략가능합니다
			System.out.println("finally 구간입니다");
		}
		
	}
}