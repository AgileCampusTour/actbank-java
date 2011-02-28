package atm.utils;

public class Card {
	
	private int PIN;
	private Account relatedAccount;
	
	public Card(int PIN, Account relatedAccount){
		this.PIN = PIN;
		this.relatedAccount = relatedAccount;
	}
	
	public int getPin(){
		return PIN;
	}
	
	public void setPin(int newPin){
		PIN = newPin;
	}
	
	public Account getRelatedAccount(){
		return relatedAccount;
	}
}