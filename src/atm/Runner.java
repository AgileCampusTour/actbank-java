package atm;

import atm.utils.Bank;
import atm.utils.Money;

public class Runner implements Runnable {
	
	private Bank bank;
	private ATM atm;
	private Thread thread;
	
	private static final int ATM_NBR = 1;
	private static final String ATM_LOCATION = "Louvain-la-Neuve";
	
	public Runner(){
		bank = new Bank();
		atm = new ATM(ATM_NBR, ATM_LOCATION, bank, new Money(2000000));
		
		thread = new Thread(this);
		thread.start();
	}
	
	public static void main(){
		new Runner();
	}
	
	public static void main(String args[]){
		new Runner();
	}
	
	public void run() {
		Money initialCash = atm.initOps();
		atm.provideServices(initialCash);
		
		System.exit(0);
	}

}
