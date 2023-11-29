/*Create a class to print the area of a square and a rectangle. The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square. */
package corej;

public class VAreaST {

	public void printArea(int length,int breadth)
	{
		int area =length*breadth;
		System.out.println("Area of Rectangle:"+area );
	}
	public void printArea(int side)
	{
		int area = side*side;
		System.out.println("Area of Square:"+area);
	}
	public static void main(String[] args) {
		VAreaST shape=new VAreaST();
		shape.printArea(5,10);
		
		shape.printArea(7);
	}
}
