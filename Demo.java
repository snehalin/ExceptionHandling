/*
 Exception-It is unwanted event occures which causes program to
 terminate abnormally.
 
 keywords:-try ,catch,throw,throws,finally		
 
 try
 {
  exception generation code
  }
  catch(Exception e)
  {
  	sysout(e);
  	}
 
 
  				
 
 */



public class Demo {

	public static void main(String[] args) {

	System.out.println("hello");	
	System.out.println("hello");
	//String s1=null;
	//System.out.println(s1.length());
	try
	 {
		System.out.println("stmt1");
	  int i=10/0;
	  System.out.println("stmt2");
	  }
	  catch(Exception e)
	  {
		  System.out.println("Catch Block");
	 	System.out.println(e);
	  	}
	System.out.println("hello");	
	System.out.println("hello");	
	System.out.println("hello");	
	
	System.out.println("hello");	
	System.out.println("hello");	
	System.out.println("hello");	
	System.out.println("hello");	

System.out.println("hello");	
}
}