package Int_Abs_demo;

public class DemoClass implements DemoInter 
{

	
	public void test() 
	{
		System.out.println("completed test method");
	}

	
	public void demo() 
	{
		System.out.println("completed demo method");
	}
	
	public static void main(String args[])
	{
		DemoClass d=new DemoClass();
		System.out.println(a);
		System.out.println(DemoClass.a);
		System.out.println(d.a);
		System.out.println(DemoInter.a);
		d.test();
		d.demo();
		d.default_demo();
		//d.static_demo(); // static method of interface are not
		                   //inherited into implemetion class
		DemoInter.static_demo();
		//d.a=10;        //variable in interface are final so we canot chsnge the vallue
	
		
	}

}
