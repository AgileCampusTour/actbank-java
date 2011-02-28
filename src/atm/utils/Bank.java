package atm.utils;

public class Bank {

	private BankData data = new BankData();

	private static Card currentTransactionCard;
	private static FingerPrint currentTransactionFinger;
	private static Account currentTransactionAccount;

	/**
	 * Constructor
	 */
	public Bank() {
	}
	
	/**
	 * Tells if the fingeprint ID maps to a known customer
	 *
	 * @param  fingerSequence the fingerprint ID
	 * @return true if the customer is known
	 */
	public boolean isCustomer(int fingerSequence){
		currentTransactionFinger = data.fingerPrints().get(""+fingerSequence);
		
		if (currentTransactionFinger == null)
			return false;
		else
			return true;
	}

	/**
	 * Runs a cash withdrawal authorized by a debit card and the associated PIN
	 *                        
	 * @param cardNbr         debit card number
	 * @param pin             the PIN entered by the customer
	 * @param ATMNbr          the ATM identifier
	 * @param amount          the withdrawn amount
	 * @param customerBalance will receive the customer account balance after the transaction succeeded
	 * @return the result of the transaction
	 */
	public int initWithdrawWithCard(int cardNbr, int pin, int ATMNbr, Money amount, Money customerBalance) {

		currentTransactionCard = data.cards().get("" + cardNbr);

		if (currentTransactionCard == null)
			return Status.UNKNOWN_CARD;

		if (currentTransactionCard.getPin() != pin)
			return Status.WRONG_PIN;

		currentTransactionAccount = currentTransactionCard.getRelatedAccount();

		if (currentTransactionAccount.balance().less(amount))
			return Status.INSUFFICIENT_AVAILABLE_BALANCE;

		Money newBalance = Money.sub(currentTransactionAccount.balance(), amount);
		customerBalance.set(newBalance);
		return Status.SUCCESS;
	}

	/**
	 * Runs a cash withdrawal authorized by a fingerprint scan
	 *                        
	 * @param fingerSequence  fingerprint sequence identifier
	 * @param ATMNbr          the ATM identifier
	 * @param amount          the withdrawn amount
	 * @param customerBalance will receive the customer account balance after the transaction succeeded
	 * @return the result of the transaction
	 */	
	public int initWithdrawWithFinger(int fingerSequence, int ATMNbr, Money amount, Money customerBalance) {

		currentTransactionFinger = data.fingerPrints().get(""+fingerSequence);

		if (currentTransactionFinger == null)
			return Status.UNKNOWN_FINGER;

		currentTransactionAccount = currentTransactionFinger.getRelatedAccount();

		if (currentTransactionAccount.balance().less(amount))
			return Status.INSUFFICIENT_AVAILABLE_BALANCE;
		
		Money newBalance = Money.sub(currentTransactionAccount.balance(), amount);
		customerBalance.set(newBalance);
		return Status.SUCCESS;
	}

	/**
	 * Returns the name of the customer identified by her fingerprint sequence ID
	 *
	 * @param fingerSequence fingerprint sequence ID
	 * @return the name of the customer
	 */
	public String getCustomerName(int fingerSequence) {
		currentTransactionFinger = data.fingerPrints().get(""+fingerSequence);
		
		if (currentTransactionFinger == null)
			return null;
		else
			return currentTransactionFinger.getRelatedAccount().customerName();
	}
	
	/**
	 *  Returns the account balance for a customer identified by her fingerprint sequence ID
	 *
	 * @param fingerSequence the fingerprint sequence ID
	 * @return the amount available on the account
	 */
	public Money getCustomerBalance(int fingerSequence) {
		currentTransactionFinger = data.fingerPrints().get(""+fingerSequence);
		
		if (currentTransactionFinger == null)
			return null;
		else
			return currentTransactionFinger.getRelatedAccount().balance();
	}
}
