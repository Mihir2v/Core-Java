/*Write a program to print the area and perimeter of a triangle having Sides of 3, 4 and 
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/
package corej;

class Triangle {
    private double SideA;
    private double SideB;
    private double SideC;

    public Triangle() {
        SideA = 3;
        SideB = 4;
        SideC = 5;
    }

    public double getArea() {
        double s = (SideA + SideB + SideC) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - SideA) * (s - SideB) * (s - SideC));
    }

    public double getPerimeter() {
        return SideA + SideB + SideC;
    }
}

public class ZTriangles {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Triangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
