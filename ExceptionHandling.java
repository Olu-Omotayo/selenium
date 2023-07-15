package may_02;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
			
		}
//		there can be multiple try/catch handling
		
		catch(Exception f)
		{
			f.printStackTrace();
		}
		
		finally {
			System.out.println("execution is Done ...");			
		}
		
	}

}
