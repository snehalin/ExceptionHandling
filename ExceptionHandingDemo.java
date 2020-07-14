
public class ExceptionHandingDemo {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hi");
		int a=10;
		int b=0;
		try
		{
			System.out.println("hefshine");
			a=10/0;//exception occures
			System.out.println("welcome");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("bye");
		System.out.println("have a nice day");
		
	}

}

/*
 try,catch,throw,throws,finally
 
 syntax
 
 try
 {
   exception generating code
 }
 catch(Throwable e)
 {
   //display exception info
 }
 
 				      Throwable
 				1.Error       2.Exception
                               1.RuntimeException                   2.IOException
                              
                               1.ArithmeticException                1.FileNotFoundException
                                                                     
                               2.ArrayIndexOutOfBoundsException     2.ClassNotFoundException
 							   3.StringIndexOutOfBoundsException    3.InterruptedException
 							   4.NullPointerException               4.MethodNotFoundException
 							   5.NumberFormatException
 
 
 
 */













