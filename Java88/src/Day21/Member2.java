package Day21;

public class Member2 {
	private String name;
	private String id;
	
	public Member2() {
		System.out.println("Member2()���� ");
	}
	public Member2(String id) {
		System.out.println("Member(String id)����");
		this.id = id;
	}
	public Member2(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id= id;
	}
	public String getId() {return id;}
	
	

}
