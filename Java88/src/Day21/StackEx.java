package Day21;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> ss = new Stack<String>(); // String Ÿ���� Stack ����
		ss.push("Apple");
		ss.push("Banana");
		ss.push("Orange");

		System.out.println(ss.pop());
		System.out.println(ss.pop());
		System.out.println(ss.pop());

		Stack<Integer> is = new Stack<Integer>();// Integer Ÿ���� Stack����
		is.push(3);
		is.push(7);
		is.push(9);
		System.out.println(is.pop());
		System.out.println(is.pop());
		System.out.println(is.pop());
	}

}

