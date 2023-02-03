package _String;

public class BankAccount {
	int balance =0;
	String accNumber;
	String ssNumber;
	
	public void init_Account(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal; //초기화
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -=amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
}
