package Day21;

public class Exam02 {
public static void main(String[] args) {
	MethodReferenceTestEx ex= new MethodReferenceTestEx();
	ex.oper((a, b)-> MethodReferenceTestEx.mul(a,b),1,1);
	//���� �޼ҵ� ����
	
	ex.oper((a, b)->ex.add(a,b),1,1);
	//�ν��Ͻ� �޼ҵ� ����
	
	ex.oper(s->s.toLowerCase(), "STRING");
	//�Ű������� �޼ҵ� ����
}
}
