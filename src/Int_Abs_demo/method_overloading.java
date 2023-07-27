package Int_Abs_demo;

public class method_overloading 
{
     void demo()
     {
    	 System.out.println("hiii");
     }
     void demo(int a)
     {
    	 int d=a;
    	 System.out.println(d);
     }
     void demo(int a,int b)
     {
    	 int c=a+b;
    	 System.out.println("addiotn "+c);
    	 
     }
     public static void main(String args[])
     {
    	 method_overloading a=new method_overloading();
    	 a.demo();
    	 a.demo(10);
    	 a.demo(4,5);
     }
}
