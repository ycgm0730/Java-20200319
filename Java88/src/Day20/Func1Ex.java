package Day20;

public class Func1Ex {

	public static void main(String[] args) {
	      Func1 func1 = new Func1() {// �͸�����ü

	         @Override
	         public void method(int number) {
	            System.out.println(number);
	         }
	      };
	      func1.method(10);

	      Func1 func3 = (int number) -> {
	         System.out.println(number);
	      };
	      func3.method(100);

	      Func1 func4 = (int number) -> System.out.println(number);
	      func4.method(100);

	      Func1 func5 = x -> System.out.println(x); // �Ű��������� ������ �� �ֽ��ϴ�.
	      func5.method(1000);

	   }

	}