package Day19;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesEx {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �����ϼ���:");
		String server = sc.next();
		if(server.equals("main")) {
			server ="maindb";
		}else {
			server= "database";
		}
		sc.close();
		Properties properties= new Properties();
		String path=PropertiesEx.class.getResource(server+".properties").getPath();
		path = URLDecoder.decode(path,"utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url= properties.getProperty("url");
		String username= properties.getProperty("username");
		String password= properties.getProperty("password");
		System.out.println("driver:" +driver);
		System.out.println("url:" +url);
		System.out.println("username:" +username);
		System.out.println("password:" +password);
	}
	
}
