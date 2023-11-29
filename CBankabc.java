/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
method by creating an object of each of the three classes.*/
package corejb;
abstract class Bank{
	public abstract int getBalance();
}
class BankA extends Bank{
	private int balance=100;
	
	@Override
	public int getBalance(){
	return balance;
	}
}
class BankB extends Bank{
	private int balance=150;

	@Override
	public int getBalance() {
		return balance;
	}
}
class BankC extends Bank{
	private int balance=200;
	
	@Override
	public int getBalance() {
		return balance;
	}			
}



public class CBankabc {

	public static void main(String[] args) 
	{
		BankA banka =new BankA();
		BankB bankb =new BankB();
		BankC bankc =new BankC();
		
		System.out.println("Balance in Bank A: $"+banka.getBalance());
		System.out.println("Balance in Bank B: $"+bankb.getBalance());
		System.out.println("Balance in Bank C: $"+bankc.getBalance());
	}
}
