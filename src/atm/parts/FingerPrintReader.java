package atm.parts;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class FingerPrintReader{
	
	private int status;
	private int fingerPrintSequenceRead;
	
	public static final int NO_FINGER = 0;
	public static final int UNREADABLE_FINGER = 1;
	public static final int FINGER_READ = 2;
	
	public FingerPrintReader(){
		status = NO_FINGER;
	}
	
	public synchronized int checkForFinger(){
		try{
			wait(1000);
		}catch(InterruptedException e){}
		
		Scanner input = new Scanner(System.in);
		String sequence = input.nextLine();
		
		if(sequence == null)
			status = UNREADABLE_FINGER;
		else{
			try{
				fingerPrintSequenceRead = parseInt(sequence);
				status = FINGER_READ;
			}catch(NumberFormatException e){
				status = UNREADABLE_FINGER;
			}
		}
		return status;
	}
	
	public int fingerPrintSequence(){
		return fingerPrintSequenceRead;
	}
}
