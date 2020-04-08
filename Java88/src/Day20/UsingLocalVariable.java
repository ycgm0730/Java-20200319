package Day20;

public class UsingLocalVariable {
	void method(int arg) { 	//arg는 final 특성을 가짐
		int localVar= 40;	//localVar는 final특성을 가짐
		
//		arg =31;	//final 특성때문에 수정 불가
//		localVal=41;	//final 특성때문에 수정 불가
		
		
		//람다식
		MyFunctionalInterface fi=()->{
			//로컬면수 사용
			System.out.println("arg:"+arg);
			System.out.println("localVar:"+ localVar+"\n");
		};
		fi.method();
	}
	void method2(int x) {
		System.out.println(x);
		x=50;
		System.out.println(x);
	}

}
