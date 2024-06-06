package day12;

public class AccountEncaps {

	private int accno;
	private String accName;
	private int balance;
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	int getBalance() {
		return balance;    
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	//without public access modifier also we can write getter setter method. 
	
	
	
}
