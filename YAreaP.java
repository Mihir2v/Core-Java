/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/
package corej;

class Rectangle
{
	private double length;
	private double breadth;
	
	public Rectangle(double length ,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea()
	{
		return length * breadth;
	}
	public double getPerameter()
	{
		return 2 *(length + breadth);
	}
}
class Square extends Rectangle
{
	public Square (double side)
	{
		super(side,side);
	}
}

public class YAreaP {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,3);
		System.out.println("Rectangle");
		System.out.println("Area: " +r.getArea());
		System.out.println("Perameter: "+r.getPerameter());
		
		System.out.println("*************************************************************");
	
		Square s=new Square(5);
		System.out.println("Square");
		System.out.println("Area: "+s.getArea());
		System.out.println("Perameter: "+s.getPerameter());
	}
}
