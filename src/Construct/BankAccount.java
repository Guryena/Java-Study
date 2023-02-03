package Construct;

public class BankAccount {
	int balance =0; //잔액
	String accNumber; //계좌번호
	String ssNumber; //주민번호
	

	public BankAccount(String acc, String ss, int bal) { //클래스에 직접 넣어주기 위해 
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
		System.out.println("계좌번호 : " + accNumber);
		System.out.println("주민번호 : " + ssNumber);
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
}
