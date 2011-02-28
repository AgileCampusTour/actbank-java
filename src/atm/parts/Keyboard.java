package atm.parts;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Keyboard{
	
	private int keyPressed;
	
	public StringBuffer echo;
	private static final int NONE=-1;
	
	public Keyboard(){
	}
	
	public int readMenuChoice(int itemsNbr){
		int keyPressed;
		do{
			keyPressed = readKeyboardEntry();
		}while(keyPressed > itemsNbr || keyPressed < 1);
		return keyPressed;
	}
	
	private synchronized int readKeyboardEntry(){
		keyPressed = NONE;
		Scanner input = new Scanner(System.in);
		keyPressed = parseInt(input.nextLine());
		return keyPressed;
	}
	
}
