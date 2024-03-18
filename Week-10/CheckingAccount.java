
public class CheckingAccount extends BankAccount {
	
	private static final double FEE = 0.15;
	
	CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean completed = true;
		double balance = super.getBalance();
		if (amount <= balance)
		{
			balance = balance - amount - FEE;
			super.setBalance(balance);
		}
		else
		{
			completed = false;
		}
		return completed;
	}

}
