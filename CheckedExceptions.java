import java.io.FileNotFoundException;
import java.io.FileReader;

//Exception :Unwanted Event that causes program termination abnormally

/*CheckedExceptions- Must be handled at Compile time otherwise prg will not compile
 Eg FileNotFoundException ,IOException,InterruptedException...
 UnCheckedException-May not be handled at Compile time but prg will compile and
 Exception occures at runtime
 ArrayIndexOutOfBoundsException
 ArithmeticException
 PartiallyCheckedExceptions--Some child classes are checked and some are unchecked expn.
 Throwable,Exception
  FullyCheckedExceptions--All child classes are checked 
  IOException
*/
public class CheckedExceptions {

	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("d:/abc.txt");
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("hii");
	}

}
