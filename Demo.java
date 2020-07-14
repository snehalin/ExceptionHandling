
public class Demo {

		
	public static void main(String[] args) {
		//child 
	//	AbstractClass a2=new AbstractClass();
		
		AbstractClass a1=new AbstractClass() {
	
			void print()
			{
				System.out.println("In Print method");
			}
		
		};
		
		a1.print();

}
}