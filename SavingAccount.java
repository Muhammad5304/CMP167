/*
 * @author Muhammad Chaudhry
 */
public class SavingAccount extends BankAccount{

	public static void main(String[] args) {
		double interest; 
		
		SavingAccount java = new SavingAccount();
		java.deposit(9000);
		java.withdraw(100);
		java.deposit(1000);
		java.withdraw(10);
		java.deposit(1000000);
		java.withdraw(99999);
		java.deposit(1000);
		java.withdraw(1);
		java.withdraw(1000);
	}
}
