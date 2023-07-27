package Int_Abs_demo;

public class Method_over2 extends Method_over
{
    void demo()
    {
    	System.out.println("hiii");
    }
    
    public static void main(String args[])
    {
        Method_over m=new Method_over();
    	m.demo();
    	Method_over2 m1=new Method_over2();
    	m1.demo();
    	
    }
}
