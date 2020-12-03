import java.sql.SQLException;

public class MultiTryCatch {

	public static void main(String[] args) {
		try
		{
			int arr[]= {1,2,3,4};
			int b=arr[6]/0;
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("hi");
	}

}
