/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods.*/
package corejb;
abstract class Shape{
	abstract double RectangleArea(double length ,double breadth);
	abstract double SquareArea (double side);
	abstract double CircleArea (double radius);
}
 class Area extends Shape{
	@Override
	double RectangleArea(double length,double breadth) {
		return length*breadth;
	}
	@Override
	double SquareArea(double side) {
		return side*side;
	}
	@Override
	double CircleArea(double radius) {
		return Math.PI *radius*radius;
	}
	
}
public class FShape {
	public static void main(String[] args) {
		Area shapeArea =new Area();
		
		System.out.println("Rectangle Area " +shapeArea.RectangleArea(5,8));
		System.out.println("Square Area " +shapeArea.SquareArea(5));
		System.out.println("Circle Area " +shapeArea.CircleArea(5));
	}

}
