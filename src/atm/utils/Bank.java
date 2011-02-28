package atm.utils;

public class Bank {

	private BankData data = new BankData();

	private static Card currentTransactionCard;
	private static FingerPrint currentTransactionFinger;
	private static Account currentTransactionAccount;

	public Bank() {
	}
	
	public boolean isCustomer(int fingerSequence){
		currentTransactionFinger = data.fingerPrints().get(""+fingerSequence);
		
		if (currentTransactionFinger == null)
			return false;
		else
			return true;
	}

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

	public String getCustomerName(int fingerSequence) {
		currentTransactionFinger = data.fingerPrints().get(""+fingerSequence);
		
		if (currentTransactionFinger == null)
			return null;
		else
			return currentTransactionFinger.getRelatedAccount().customerName();
	}
	
	public Money getCustomerBalance(int fingerSequence) {
		currentTransactionFinger = data.fingerPrints().get(""+fingerSequence);
		
		if (currentTransactionFinger == null)
			return null;
		else
			return currentTransactionFinger.getRelatedAccount().balance();
	}
}
