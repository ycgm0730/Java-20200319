package Day17;

/*�ٱ� Ŭ����*/
//public class A {
//
//	/* �ν��Ͻ� ��� Ŭ���� */
//	class B {
//		B() {
//			System.out.println("B��ü�� ������");
//		}
//
//		int field1;
//
////		static int field2;
//
//		void method1() {
//
//		}
//		// static void method2(){}
//	}
//
//	// ���� ��� Ŭ����
//	static class C {
//		C() {
//			System.out.println("C��ü�� ������");
//
//		}
//
//		int field1;
//
////		static field2;
////		void method1() {
////			
//		}
//
//		static void method2() {
//
//		}
//
//	}
//
//	/* ���� Ŭ���� */
//	class D {
//		D() {
//			System.out.println("D��ü�� ������");
//		}
//
//		int field1;
//
//		// static int field2;
//		void method1() {
//
//		}
//		// static
////		D d=new D();
////		d.field2();
//	}
//
//	// �ν��Ͻ� �ʵ�
//	B field1 = new B(); // (o)
//	C field2 = new C(); // (o)
//	
//	// �ν��Ͻ� �޼ҵ�
//
//	void method1() {
//		B var1 = new B(); // (o)
//		C var2 = new C();// (o)
//	}
//
////�����ʵ� �ʱ�ȭ
////static B field3 =new B();	//(x) A��ü ����
//	static C outerField4 = new C(); // (o)������ ����
////���� �޼ҵ�
//
//	static void method2() {
//		// B var1 -new B(); //(x) A��ü ����
//		C var2 = new C(); // (o) ������ ����
//	}
//}
