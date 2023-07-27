package Int_Abs_demo;

public interface DemoInter {
	
	int a=10;
	void test();
	void demo();
	
	public default void default_demo()
	{
		System.out.println("default method of interface");
	}
	
	public static void static_demo()
	{
		System.out.println("static method of interface");
	}

}
