/*• W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
than account balance then program will show custom exception otherwise amount 
will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
2500 */
package corejb;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class Account {
	private int balance;

	public Account(int initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw " + amount);
		} else {
			balance -= amount;
			System.out.println("Amount withdrawn: " + amount);
			System.out.println("Remaining balance: " + balance);
		}
	}
}

public class LcustomWithdraw {
	public static void main(String[] args) {
		int initialBalance = 2000;
		Account account = new Account(initialBalance);

		try {
			System.out.println("Account balance is: " + initialBalance);

			int withdrawAmount = 2500;
			System.out.println("Enter withdraw amount: " + withdrawAmount);

			account.withdraw(withdrawAmount);
		} catch (InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
