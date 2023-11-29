/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
having a method with the same name 'message' that prints "This is first subclass" 
and "This is second subclass" respectively. Call the methods 'message' by creating 
an object for each subclass. */
package corejb;
abstract class Parent	{
	public 	abstract void message();
	
}
class FirstSubClass extends Parent{
	@Override
	public void message() {
		System.out.println("This is First Sub Class");
	}
}

class SecondSubClass extends Parent{
	@Override
	public void message() {
		System.out.println("This is Second Sub Class");
	}
}


public class BClassSubclsss {

	public static void main(String[] args) {
		Parent firstO=new FirstSubClass();
		firstO.message();
		
		Parent secondO = new SecondSubClass();
		secondO.message();
		
	}
	
}
