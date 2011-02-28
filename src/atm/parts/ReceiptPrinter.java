package atm.parts;

import java.util.Date;

import atm.utils.Money;

public class ReceiptPrinter{
	public ReceiptPrinter(){
	}
	
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
