package Bonus.Lecture;

public class BankAccount {

	static String BankName = "Bank Of India";
	private String AccountHolderName;
	String AccountNumber;
	Float Blance;
	private float Accountbalance;
	private char[] balance;

	public static void main(String[] args) {
		double loanInterestRate = 7.5;
		System.out.println(loanInterestRate);

		System.out.println(BankAccount.BankName);
		BankAccount bankaccount = new BankAccount();
		bankaccount.setAccountHolderName("John");
		bankaccount.AccountNumber = "1233245";
		bankaccount.Accountbalance = 2000f;
		System.out.println(bankaccount.balance);
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

}
