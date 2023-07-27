package Int_Abs_demo;

public class Encap_demo 
{
	private int r=10;
	private static int t=70;
	private String username="abc";
	private String password="abc@123";

	 public int demo()
	 {
		 System.out.println(r);
		 return r;
	 }
	 
	 public void usernameDemo()
	 {
		 System.out.println(username);
	 }
	 
	 public void passwordDemo()
	 {
		 System.out.println(password);
	 }
	 
	 public static int test()
	 {
		 System.out.println(t);
		 return t;
	 }
}
