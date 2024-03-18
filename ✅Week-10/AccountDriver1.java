import java.text.*; // to use Decimal Format
/**Demonstrates the BankAccount and derived classes*/
public class AccountDriver1
{
	public static void main(String[] args)
	{
		double put_in = 500;
		double take_out = 1000;
		DecimalFormat myFormat;
		String money;
		String money_in;
		String money_out;
		boolean completed;
		// to get 2 decimals every time
		myFormat = new DecimalFormat("#.00");
		//to test the Checking Account class
		CheckingAccount myCheckingAccount =
			new CheckingAccount ("Benjamin Franklin", 1000.0);
		System.out.println ("Account Number "
			+ myCheckingAccount.getAccountNumber() +
			" belonging to " + myCheckingAccount.getOwner());
		money = myFormat.format(
		myCheckingAccount.getBalance());
		System.out.println ("Initial balance = $" + money);
		myCheckingAccount.deposit (put_in);
		money_in = myFormat.format(put_in);
		money = myFormat.format(
		myCheckingAccount.getBalance());
		System.out.println ("After deposit of $" + money_in
			+ ", balance = $" + money);
		completed = myCheckingAccount.withdraw(take_out);
		money_out = myFormat.format(take_out);
		money = myFormat.format(
		myCheckingAccount.getBalance());
		if (completed)
		{
			System.out.println ("After withdrawal of $" +
				money_out + ", balance = $" + money);
		}
		else
		{
			System.out.println ("Insuffient funds to " +
				" withdraw $" + money_out +
				", balance = $" + money);
		}
	}
}