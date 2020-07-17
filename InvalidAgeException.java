
public class InvalidAgeException extends Exception //Exception-checked   RuntimeException-Unchecked
{
	
	InvalidAgeException()
	{
		super("You are small");
		
		
	}
	public InvalidAgeException(String str)
	{
		super(str);
		
	}
}
//throw Throwable Instance