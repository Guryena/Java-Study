package Construct;

public class Construct_EX {

	public static void main(String[] args) {
		
		BankAccount ref = new BankAccount("12-34-89", "990990-9090990", 10000);
		BankAccount ref2 = new BankAccount("33-55-09", "770088-5521345", 30000);
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
		ref2.deposit(2000);
		ref2.withdraw(500);
		check(ref2);
	}

	
	private static void check(BankAccount acc)// 파라미터:매개변수
	{
		acc.checkMyBalance();
	}

}
