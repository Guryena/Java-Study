package Object_and_Instance;

public class BankAccountTEST {
	public static void main(String[] args) {

		BankAccount yoon = new BankAccount();
		BankAccount pack = new BankAccount();
		
		yoon.deposit(5000);
		yoon.checkMyBalance();

		yoon.withdraw(1000);
		yoon.checkMyBalance();

		
		
		pack.deposit(4000);
		pack.checkMyBalance();
		
		pack.withdraw(5000);
		pack.checkMyBalance();
		
	}

}
