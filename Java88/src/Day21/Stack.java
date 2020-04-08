package Day21;

public class Stack<T> {
	int position;
	Object[] stck;

	public Stack() {
			position =0;
			stck =new Object[20];
		}

	// ���ÿ� ��� ����
	public void push(T item) {
		if (position == 20)
			return;
		stck[position] = item;
		position++;
	}

	// ���ÿ� ��� ������
	@SuppressWarnings("unchecked")
	public T pop() {
		if (position == 0)
			return null;
		position--;
		return (T) stck[position];
	}
}
