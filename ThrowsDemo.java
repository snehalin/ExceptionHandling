import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	static void method1() throws FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fin=new FileInputStream("D:\\Hefshine\\MarchBatchPrograms\\ArrayPrograms\\src\\Min.java"); 
	   throw new ClassNotFoundException();
	}
	
	
	public static void main(String[] args) {
		try {
		method1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
		/*
		 void m1() throws Exception1,Exception2.....
		 {
		 
		 }
		 
		 throw                     throws
	1.single exception    1.Multiple Exception can be throws.	 
		 
	2.syntax	 
	3.Mainly Used to throw   3.Mainly used to throw checked exception
	 User defined Exception	 


throws exception towards
	jvm or method or  catch block	 
		 
		 
		 
		 
		 */
		
		
	}
		
		
}
