
public class RuntimeStack {
    static void m1()
    {System.out.println("in m1() start");
    	        m2();//exception
    	    	System.out.println("in m1() ends");
    }
	 static void m2()
    {
    	System.out.println("in m2() start");
    	int a=10/0;
    	System.out.println("in m2() ends");
    }
	public static void main(String[] args) {
		System.out.println("in main start");
		 try {
		  	     m1();
             	}
    	catch(Exception e)
    	{System.out.println(e);
    	}
		System.out.println("in main end");
	}

	/*main->m1->m2
	  main->m1
	  main
	  
	 */
	
}
