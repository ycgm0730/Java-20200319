package Day18;

public class MemberThinEx {
	public static void main(String[] args) {
		//������ü����
		MemberThin original = new MemberThin("blue", "ȫ�浿", "12345", 25, true)	;
		//���� ��ü�� ���� �Ŀ� �н����� ����
//		MemberThin cloned = original.getMember();
		MemberThin cloned = original;//���� ��ü���� �н����� ����
		cloned.password="67890";
		System.out.println(original.hashCode()+":"+cloned.hashCode());
		
		System.out.println("[������ü�� �ʵ尪]" );
		System.out.println("id:"+cloned.id);
		System.out.println("name:"+cloned.name);
		System.out.println("password:"+cloned.password);
		System.out.println("age:"+cloned.age);
		System.out.println("adult:"+cloned.adult);
		System.out.println();
		System.out.println("[������ü�� �ʵ尪]");
		System.out.println("id:"+original.id);
		System.out.println("name:"+original.name);
		System.out.println("password"+original.password);
		System.out.println("age:"+original.age);
		System.out.println("adult:"+original.adult);
	}
}
