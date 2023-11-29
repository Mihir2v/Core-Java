/*in JAVA Create a class named 'Print Number' to print various numbers of different data types 
by creating different methods with the same name 'printn' having a parameter for 
each data type*/
package corej;

public class TPrintNum {
	public void printn(int num )
	{
		System.out.println("Integer:"+num);
	}

	public void printn(float num)
	{
		System.out.println("Float:"+num);
	}
	
	public void printn(double num)
	{
		System.out.println("Double:"+num);
	}
	
	public void printn(long num)
	{
		System.out.println("Long:"+num);
	}
	 
	public void printn(boolean value)
	{
		System.out.println("Boolean:"+value);
	}
	
	public void printn(String str)
	{
		System.out.println("String:"+str);
	}
	public static void main(String[] args) {
		TPrintNum dt=new TPrintNum();
		dt.printn(10);
		dt.printn(3.14f);
		dt.printn(3.14159);
		dt.printn(100000000000L);
		dt.printn(true);
		dt.printn("Hello World");
	}
}
