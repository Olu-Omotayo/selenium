package may_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReadDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("./src/may_02/student.properties");
			
			Properties p = new Properties();
			p.load(fis);
			String id = p.getProperty("Sid");
			System.out.println(id);
			System.out.println(p.getProperty("Sname"));
			System.out.println(p.getProperty("Snumber"));
			
			
//		IOException is a parent exception handler, overriding many other including FileNotFoundException
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
