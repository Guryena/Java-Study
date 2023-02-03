package Ref;

public class PassingRef {

	public static void main(String[] args) {
		
		BankAccount ref = new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
		
	}

	private static void check(BankAccount acc)// 파라미터:매개변수
	{
		acc.checkMyBalance();
	}

}
