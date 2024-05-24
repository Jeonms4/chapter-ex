package exam01;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			// System.out.println("잔고 부족");
			throw new InsufficientException("잔고부족 " + "모자란 금액" + (money-balance));
		} else {
			balance -= money;
		}
	}
	
}
