import java.io.IOException;
import java.util.Scanner;

public class MultiTrycatch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("index and denomenator");
		int i=sc.nextInt();
		b=sc.nextInt();
		try
		{
			c=a[i]/b; //2/0
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of try catch");
		
		
		
		
		
		
	}

}
/*
try
{
	10/0;
	sysout(a[10])
}
catch(Exception1 e)
{
	
}
catch(Exception2 e)
{
	
}
catch(Exception3 e)
{
	
}
*/