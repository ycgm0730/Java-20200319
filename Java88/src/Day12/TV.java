package Day12;

public class TV {
	
	//�ʵ� 
	String company;
	int year;
	int inch;
	
	//������
	TV(String company, int year, int inch){
		this.company=company;
		this.year=year;
		this.inch=inch;
		
	}
	//�޼ҵ�
	void show() {
		System.out.println(company+"���� ����"+year+"����"+32+"��ġTV");
	}
}
