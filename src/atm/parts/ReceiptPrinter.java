package atm.parts;

import java.util.Date;

import atm.utils.Money;

public class ReceiptPrinter{
	
	/*
	 * Constructor
	 */
	
	public ReceiptPrinter(){
	}
	
	/**
	 * Prints the receipt
	 * 
	 * @param atmNumber is the number that identifies the ATM
	 * @param location is a String that represents the location of the ATM
	 * @param description is a String that describes the bank operation that is being printed
	 * @param amout is the amount that was withdrawn in the form of a Money object
	 * @param balance is the current balance of the customer who made the bank operation
	 */
	public void print(int atmNumber, String location, String description, Money amount, Money balance){
		String receiptLines[] = new String[9];
		receiptLines[0] = "--------------------------------------------------------\n";
		receiptLines[1] = new Date().toString()+"\n";
		receiptLines[2] = "Performed on ATM number "+atmNumber+" in "+location+"\n";
		receiptLines[3] = description+"\n";
		receiptLines[4] = "--------------------------------------------------------\n";
		receiptLines[5] = "Amount:          "+amount.euros()+"\n";
		receiptLines[6] = "Current Balance: "+balance.euros()+"\n";
		receiptLines[7] = "--------------------------------------------------------\n";
		receiptLines[8] = "A bient™t\n";
		
		for(int j=0; j<9; j++){
			System.out.print(receiptLines[j]);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
