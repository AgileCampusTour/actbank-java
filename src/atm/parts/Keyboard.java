package atm.parts;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Keyboard{
	
	private int keyPressed;
	
	public StringBuffer echo;
	private static final int NONE=-1;
	
	/* Constructor */
	
	public Keyboard(){
	}
	
	/**
	 * Reads the choice made by the customer
	 * 
	 * @param itemsNbr, the number of items in the list of options
	 * @return the chosen option as an integer
	 */
	public int readMenuChoice(int itemsNbr){
		int keyPressed;
		do{
			keyPressed = readKeyboardEntry();
		}while(keyPressed > itemsNbr || keyPressed < 1);
		return keyPressed;
	}
	
	/**
	 * Reads the keyboard entry
	 * 
	 * @return the integer that was entered through the keyboard
	 */
	private synchronized int readKeyboardEntry(){
		keyPressed = NONE;
		Scanner input = new Scanner(System.in);
		keyPressed = parseInt(input.nextLine());
		return keyPressed;
	}
	
}
