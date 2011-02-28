package atm.parts;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class CardReader{
	
	private int status;
	private int cardNumberRead;
	
	public static final int NO_CARD = 0;
	public static final int CARD_UNREADABLE = 1;
	public static final int CARD_READ = 2;
	
	/* Constructor */
	
	public CardReader(){
		status = NO_CARD;
	}
	
	
	/** 
	 * Simulates the ejection of a debit card
	 */
	public void ejectCard(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		status = NO_CARD;
	}
	
	/**
	 * Checks if there is a card in the card reader and returns its status
	 * Check the private constants at the beginning of the file for more info about the satus codes
	 * 
	 * @return a status code
	 */
	public synchronized int checkForCard(){
		try{
			wait(1000);
		}catch(InterruptedException e){}
		
		/* We don't have any REAL card reader so we ask the user to type the card number */
		Scanner input = new Scanner(System.in);
		String cardNumber = input.nextLine();
		
		if(cardNumber == null){
			status = CARD_UNREADABLE;
		}else{
			try{
				cardNumberRead = parseInt(cardNumber);
				status = CARD_READ;
			}catch(NumberFormatException e){
				status = CARD_UNREADABLE; 
			}
		}
		return status;
	}
	
	
	/**
	 * Returns the number of the card read
	 * 
	 * @return card number for current session
	 */
	public int cardNumber(){
		return cardNumberRead;
	}
	
}
