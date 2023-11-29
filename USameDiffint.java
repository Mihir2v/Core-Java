/*Create a class to print an integer and a character with two methods having the same 
name but different sequence of the integer and the character parameters. For 
example, if the parameters of the first method are of the form (int n, char c), then 
that of the second method will be of the form (char c, int n).*/
package corej;

public class USameDiffint {
	public void printData(int a,char c)
	{
		System.out.println("Print Integer: "+a);
		System.out.println("Print Character: "+c);
	}
	public void printData(char c, int a)
	{
		System.out.println("Print Character: "+c);
		System.out.println("Print Integer: "+a);
	}

	public static void main(String[] args) {
		USameDiffint printer=new USameDiffint();
		
		printer.printData(10,'A');
		printer.printData('B',10);
	}
}
