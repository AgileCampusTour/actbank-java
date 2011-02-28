package atm.parts;
import atm.utils.Money;


public class CashDispenser {

	private Money availableCash;
	
	/* Constructors */
	
	public CashDispenser(){
		availableCash = new Money(0);
	}
	
	/* Instance methods */
	
	public void setAvailableCash(Money initialAmount){
		availableCash = initialAmount;
	}
	
	public Money getAvailableCash(){
		return availableCash;
	}
	
	public void dispenseMoney(Money amount){
		try{
			Thread.sleep(4000);
		} catch(InterruptedException e)
		{}
		availableCash.subtract(amount);
	}
}
