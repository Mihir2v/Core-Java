/*Create a class named 'Member' having the following members: 
1. Data members 
2. Name 
3. Age 
4. Phone number 
5. Address 
6. Salary 
It also has a method named 'printSalary' which prints the salary of the members*/
package corej;

class Member 
{
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    
    public Member(String name, int age, String phoneNumber, String address, double salary) 
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

	public class XPrintT 
	{
    public static void main(String[] args) 
    	{
    		Member m = new Member("John Doe", 30, "1234567890", "123 Main St", 50000);
        
    		m.printSalary();
    	}
	}
