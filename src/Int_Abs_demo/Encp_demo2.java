package Int_Abs_demo;

public class Encp_demo2 
{

	public static void main(String args[])
	{
		Encap_demo e=new Encap_demo();
		int p=e.demo();
		e.usernameDemo();
		e.passwordDemo();
		
		int x=Encap_demo.test();
		System.out.println(x);
		
		
	   // a.r;
	   //a.usernameDemo();         //privte members not accessible
	   //a.passwordDemo()
		
	}
}
