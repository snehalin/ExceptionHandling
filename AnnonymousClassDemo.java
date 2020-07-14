
abstract class A
{
	abstract void display();
}



public class AnnonymousClassDemo extends A{

	void display()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		AnnonymousClassDemo  a1=new AnnonymousClassDemo ();
		a1.display();
	}

}
