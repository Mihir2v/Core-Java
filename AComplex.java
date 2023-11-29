/*Print the sum, difference and product of two complex numbers by creating a class 
named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by user*/
package corejb;

import java.util.Scanner;

class Complex{
		private double real;
		private double imaginary;
		
		public Complex(double real,double imaginary) {
			this.real=real;
			this.imaginary=imaginary;
		}
		public Complex add(Complex c) {
			double sumr=this.real+c.real;
			double sumi=this.imaginary+c.imaginary; 
			return new Complex(sumr,sumi);
		}
		public Complex substract (Complex c) {
			double diffr=this.real - c.real;
			double diffi=this.imaginary - c.imaginary;
			return new Complex(diffr,diffi);
		}
		public Complex multiply(Complex c) {
			double prodr=(this.real * c.real)-(this.imaginary * c.imaginary);
			double prodi=(this.real *c.imaginary) - (this.imaginary * c.real);
			return new Complex(prodr,prodi);
		}
		@Override
		public String toString() {
	        if (imaginary >= 0) {
	            return real + " + " + imaginary + "i";
	        } else {
	            return real + " - " + Math.abs(imaginary) + "i";
	        }
		}
	}
	public class AComplex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Real part of the First Complex Number: ");
		double reala=sc.nextDouble();
		System.out.print("Enter the Imaginary part of the First Complex Number: ");
		double imaginarya=sc.nextDouble();
		Complex Complexa=new Complex(reala,imaginarya);
		
		System.out.print("Enter the Real part of the Second Complex Number: ");
		double realb=sc.nextDouble();
		System.out.print("Enter the Imaginary part of the Secong Complex Number: ");
		double imaginaryb=sc.nextDouble();
		Complex Complexb= new Complex(realb,imaginaryb);
		
		Complex sum =Complexa.add(Complexb);
		Complex diff=Complexa.substract(Complexb);
		Complex product=Complexa.multiply(Complexb);
		
		System.out.println("Sum: "+sum);
		System.out.println("Difference: "+diff);
		System.out.println("Multiply: "+product);
		
		sc.close();
	}
}
