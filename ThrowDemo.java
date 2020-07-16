import java.io.FileNotFoundException;

public class ThrowDemo {

	public static void main(String[] args) {
		
		try
		{if(10<20)
		{
		throw new ArithmeticException();//Exception generate
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	System.out.println("hello");
	
	try
	{
	throw new FileNotFoundException("b.java");
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
	}

}

//throw ThrowableInstance;
//eg. throw new ArithmeticException();
