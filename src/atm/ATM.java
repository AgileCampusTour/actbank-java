package atm;

import atm.parts.*;
import atm.utils.Bank;
import atm.utils.Money;

public class ATM {

	private int number;
	private String location;
	private Bank bank;
	private FingerPrintReader fingerReader;
	private CashDispenser cashDispenser;
	private Keyboard keyboard;
	private Display display;
	private ReceiptPrinter receiptPrinter;
	private Money initialCash;

	private static final int RUNNING = 0;

	private int state;

	public ATM(int atmNbr, String atmLocation, Bank bank, Money initialCash) {
		number = atmNbr;
		location = atmLocation;
		this.bank = bank;
		this.initialCash = initialCash;

		fingerReader = new FingerPrintReader();
		cashDispenser = new CashDispenser();
		keyboard = new Keyboard();
		display = new Display();
		receiptPrinter = new ReceiptPrinter();
	}

	public Money initOps() {
		state = RUNNING;
		return initialCash;
	}

	public void provideServices(Money initialCash) {
		cashDispenser.setAvailableCash(initialCash);
		while (state == RUNNING) {
			beginSession();
		}
	}
	
	public void beginSession(){
		//TODO Implement me!
	}
}
