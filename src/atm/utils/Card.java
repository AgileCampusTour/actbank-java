package atm.utils;

public class Card {
	
	private int PIN;
	private Account relatedAccount;
	
	/**
	 * Constructor
	 * 
	 * @param PIN the PIN code of the card
	 * @param relatedAccount the bank account the card is linked to
	 */
	public Card(int PIN, Account relatedAccount){
		this.PIN = PIN;
		this.relatedAccount = relatedAccount;
	}
	
	/**
	 * Returns the PIN code of the card
	 *
	 * @return the PIN code
	 */
	public int getPin(){
		return PIN;
	}
	
	/**
	 * Sets a new PIN code on the card
	 * 
	 * @param newPin the new PIN code to set on the card
	 */
	public void setPin(int newPin){
		PIN = newPin;
	}
	
	/** 
	 * Returns the account the card links to
	 *
	 * @return the linked bank account 
	 */
	public Account getRelatedAccount(){
		return relatedAccount;
	}
}