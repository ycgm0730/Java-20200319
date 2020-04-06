package Day19;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<>();
		
		int num;
		try {
			num =stack.peek();	
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("�����Ͱ� �����ϴ�");
		}
		stack.push(10);
		stack.push(20);
		num=stack.peek();
		System.out.println(num);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println();
		
		while(!stack.isEmpty()) {
			num = stack.pop();
			System.out.println(num);
		}
		System.out.println(stack.isEmpty());
	}

}
