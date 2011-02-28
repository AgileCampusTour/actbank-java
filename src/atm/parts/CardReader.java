package atm.parts;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class CardReader{
	
	private int status;
	private int cardNumberRead;
	
	public static final int NO_CARD = 0;
	public static final int CARD_UNREADABLE = 1;
	public static final int CARD_READ = 2;
	
	public CardReader(){
		status = NO_CARD;
	}
	
	public void ejectCard(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		status = NO_CARD;
	}
	
	public synchronized int checkForCard(){
		try{
			wait(1000);
		}catch(InterruptedException e){}
		
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
	
	public int cardNumber(){
		return cardNumberRead;
	}
	
}
