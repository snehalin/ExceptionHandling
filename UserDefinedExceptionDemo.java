
public class UserDefinedExceptionDemo {

	public static void main(String[] args) //throws InvalidAgeException {
	{	
		int age=17;
		if(age<18)
		{
			try{
			//throw new InvalidAgeException("Invalid age,age less than 18 not allowed ");
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e);
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
			
        System.out.println("hello");
	}

}
