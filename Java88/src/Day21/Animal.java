package Day21;

public class Animal {
	String kind;
	int age;
	public Animal(String kind, int age) {
		super();
		this.kind=kind;
		this.age=age;
	}
	public String roString() {
		return "Animal [kind ="+kind+", age="+age+"]";
	}
}
