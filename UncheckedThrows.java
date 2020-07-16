
public class UncheckedThrows {
 
	static void method1()//throws ArithmeticException  no need to write 
	{
		try
		{
		int a=10/0;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		method1();
		System.out.println("hello");
	}

}
