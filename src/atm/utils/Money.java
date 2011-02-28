package atm.utils;

public class Money {
	
	/* Instance variables */
	
	private int cents;
	
	/* Constructors */
	
	public Money(){
		cents = 0;
	}
	
	public Money(int euros){
		cents = 100*euros;
	}
	
	public Money(int euros, int cents){
		this.cents = 100*euros + cents;
	}
	
	/* Instance methods */
	
	public void set(Money value){
		cents = value.cents;
	}
	
	public Money add(Money toAdd){
		this.cents += toAdd.cents;
		return this;
	}
	
	public Money subtract(Money toSubtract){
		this.cents -= toSubtract.cents;
		return this;
	}
	
	public int euros(){
		return this.cents/100;
	}
	
	public int cents(){
		return this.cents;
	}
	
	public boolean equals(Money toCompare){
		return this.cents == toCompare.cents;
	}
	
	public boolean less(Money toCompare){
		return this.cents < toCompare.cents;
	}
	
	public boolean more(Money toCompare){
		return this.cents > toCompare.cents;
	}
	
	/* Class methods */
	
	static public Money add(Money amount1, Money amount2){
		return new Money(0, amount1.cents+amount2.cents);
	}
	
	static public Money sub(Money amount1, Money amount2){
		return new Money(0, amount1.cents-amount2.cents);
	}
	
}
