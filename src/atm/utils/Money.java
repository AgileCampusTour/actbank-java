package atm.utils;

public class Money {
	
	/* Instance variables */
	
	private int cents;
	
	/* Constructors */
	
	public Money(){
		cents = 0;
	}
	
	/**
	 * The amount is stored as cents
	 * 
	 * @param euros is the number of euros available in that Money object 
	 */
	public Money(int euros){
		cents = 100*euros;
	}
	
	/**
	 * The amount is stored as cents
	 * 
	 * @param euros is the number of euros available in that Money object
	 * @param cents is the number of euro cents available in that Money object 
	 */
	public Money(int euros, int cents){
		this.cents = 100*euros + cents;
	}
	
	/* Instance methods */
	
	/**
	 * Changes the amount available in a Money Object
	 * 
	 * @param value is a Money object 
	 */
	public void set(Money value){
		cents = value.cents;
	}
	
	/**
	 * Add a Money object available cents to the current instance
	 * 
	 * @param toAdd is a Money object
	 * @return the current instance modified 
	 */
	public Money add(Money toAdd){
		this.cents += toAdd.cents;
		return this;
	}
	
	/**
	 * Subtract a Money object available cents to the current instance
	 * 
	 * @param toSubtract is a Money object
	 * @return the current instance modified 
	 */
	public Money subtract(Money toSubtract){
		this.cents -= toSubtract.cents;
		return this;
	}
	
	/**
	 * Gives the number of euros available in a Money instance
	 * 
	 * @return the number of euros available as an integer 
	 */
	public int euros(){
		return this.cents/100;
	}
	
	/**
	 * Gives the number of euro cents available in a Money instance
	 * 
	 * @return the number of euro cents available as an integer 
	 */
	public int cents(){
		return this.cents;
	}
	
	/**
	 * Checks whether a Money object has the same number of cents than the current instance
	 * 
	 * @param toCompare a Money object to compare
	 * @return true if they have the same amount of cents
	 * false if the amount of cents is different
	 */
	public boolean equals(Money toCompare){
		return this.cents == toCompare.cents;
	}
	
	/**
	 * Checks whether the current instance has less cents than another Money object
	 * 
	 * @param toCompare a Money object to compare
	 * 
	 * @return true if the current instance has less cents than toCompare
	 * false if the current instance doesn't have less cents than toCompare
	 */
	public boolean less(Money toCompare){
		return this.cents < toCompare.cents;
	}
	
	/**
	 * Checks whether the current instance has more cents than another Money object
	 * 
	 * @param toCompare a Money object to compare
	 * @return true if the current instance has more cents than toCompare
	 * false if the current instance doesn't have more cents than toCompare
	 */
	public boolean more(Money toCompare){
		return this.cents > toCompare.cents;
	}
	
	/* Class methods */
	
	/**
	 * Static method that adds two Money instances
	 * 
	 * @param amout1 a Money instance
	 * @param amount2 a Money instance
	 * @return a new Money instance resulting of the addition of the two instances cents 
	 */
	static public Money add(Money amount1, Money amount2){
		return new Money(0, amount1.cents+amount2.cents);
	}
	
	/**
	 * Static method that subtracts two Money instances
	 * 
	 * @param amout1 a Money instance
	 * @param amount2 a Money instance
	 * @return a new Money instance resulting of the subtraction of the two instances cents
	 */
	static public Money sub(Money amount1, Money amount2){
		return new Money(0, amount1.cents-amount2.cents);
	}
	
}
