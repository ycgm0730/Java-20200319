package Day18;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name= name;
		students= (T[])(new Object[capacity]);
		
	}//Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n]���·� �迭�� �����Ҽ� ����
		//(T[]) )(new Object[n])���� �����ؾ��Ѵ�
	
	
	public String getName() { return name;}
	public T[] getStudents( ) {return students;}
	public	void add(T t) {//�迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
		for(int i=0; i< students.length; i++) {
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
}
