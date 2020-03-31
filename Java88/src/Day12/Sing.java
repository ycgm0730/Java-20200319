package Day12;

public class Sing {
	int year;
	String cont;
	String arty;
	String title;
	
	
	Sing(int year, String cont, String arty, String title){
		this.year=year;
		this.cont=cont;
		this.arty=arty;
		this.title=title;
		
	}
	void show() {
		System.out.println(year+"년 "+cont+"국적의 "+arty+"가 부른 "+title);
	}
}
