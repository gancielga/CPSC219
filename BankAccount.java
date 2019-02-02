//Class and instance variables//
public class BankAccount {
	double balance= 0.0;
	String accountNumber= "1111";

   
//Accessor (getter) Methods:
//	getBalance() which returns the value of the instance variable balance.//
	public double getBalance(){ 
		return balance;
	}
//	getAccountNumber() which returns the value in the instance variable accountNumber.
	public String getAccountNumber(){
		return accountNumber;
	}
//	toString() which returns the information in the instance variables in the following format: <account number>: <balance>
	public String toString() {
		return accountNumber +": "+ balance;
	}
//Mutator (setter) Methods: deposit and withdraw. Each take a double as an argument and don't return anything.
	public  void deposit(double deposit) {
		if (deposit >=0) {
			balance+=deposit;
		}
	}
	public void withdraw(double wit) {
		if (wit <= balance && wit >= 0) {
			balance-=wit;
		}
	}
//Constructors:
//	Default (no arguments)
	public BankAccount() {
		
	}
//One that takes a start balance.
	public BankAccount(double newbalance) {
		
		balance= newbalance;
		}
//One that takes a start balance and account number.
	public BankAccount(double newbalance,String newaccountNumber) {
		
		balance= newbalance;
		accountNumber=newaccountNumber;
	}
	
}

