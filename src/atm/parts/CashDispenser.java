package atm.parts;

import atm.utils.*;


public class CashDispenser {

	private Money availableCash;
	
	/* Constructors */
	
	public CashDispenser(){
		availableCash = new Money(0);
	}
	
	/* Instance methods */
	
	/**
	 * Lets you set the available cash in the cash dispenser tray
	 * 
	 * @param the initial amount in the form of a Money object
	 */
	public void setAvailableCash(Money initialAmount){
		availableCash = initialAmount;
	}
	
	/**
	 * Gives the amount of cash left in the dispenser
	 * 
	 * @return the available cash in the dispenser
	 */
	public Money getAvailableCash(){
		return availableCash;
	}
	
	/**
	 * Simulates a cash dispense
	 * 
	 * @param the amount we want to dispense, in the form of a Money object
	 */
	public void dispenseMoney(Money amount){
		try{
			Thread.sleep(4000);
		} catch(InterruptedException e)
		{}
		availableCash.subtract(amount);
	}
}
