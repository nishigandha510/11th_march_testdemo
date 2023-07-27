package Int_Abs_demo;

public class Method_hiding2 extends Method_hiding
{
	static void demo()
	{
		System.out.println("hiii");
	}
	
	public static void main(String args[])
	{
		Method_hiding.demo();
		Method_hiding2.demo();
	}

}
