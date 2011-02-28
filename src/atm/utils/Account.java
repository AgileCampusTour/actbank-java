package atm.utils;

public class Account {
	
	private String customerName;
	private int accountNbr;
	private Money balance;
	
	/**
	 * Constructor
	 *
	 * @param customerName name of the customer
	 * @param accountNbr   identifier of the bank account
	 * @param balance      money available on the bank account
	 */
	public Account(String customerName, int accountNbr, Money balance){
		this.customerName = customerName;
		this.accountNbr = accountNbr;
		this.balance = balance;
	}
	
	/**
	 * Returns the name of the customer
	 *
	 * @return name of the customer
	 */
	public String customerName(){
		return customerName;
	}
	
	/**
	 * Returns the bank account ID
	 *
	 * @return bank account number 
	 */
	public int accountNbr(){
		return accountNbr;
	}
	
	/**
	 * Returns the account balance
	 *
	 * @return the money available on the account
	 */
	public Money balance(){
		return balance;
	}
	
	/** 
	 * Sets the new bank account balance
	 *
	 * @param value The new balance
	 */
	public void setBalance(Money value){
		balance = value;
	}

}
