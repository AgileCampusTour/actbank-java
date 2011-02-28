package atm.utils;

public class Account {
	
	private String customerName;
	private int accountNbr;
	private Money balance;
	
	public Account(String customerName, int accountNbr, Money balance){
		this.customerName = customerName;
		this.accountNbr = accountNbr;
		this.balance = balance;
	}
	
	public String customerName(){
		return customerName;
	}
	
	public int accountNbr(){
		return accountNbr;
	}
	
	public Money balance(){
		return balance;
	}
	
	public void setBalance(Money value){
		balance = value;
	}

}
