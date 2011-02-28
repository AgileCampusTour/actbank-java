package atm.utils;

public class FingerPrint {
	
	private int sequenceNbr;
	private Account relatedAccount;
	
	/** 
	 * Constructor
	 *
	 * @param sequenceNbr the fingerprint sequence ID
	 * @param relatedAccount the bank account the fingerprint links to
	 */
	public FingerPrint(int sequenceNbr, Account relatedAccount){
		this.sequenceNbr = sequenceNbr;
		this.relatedAccount = relatedAccount;
	}
	
	/**
	 * Returns the fingerprint sequence ID
	 *
	 * @return the fingerprint sequence ID
	 */
	public int getSequence(){
		return sequenceNbr;
	}
	
	/** 
	 * Returns the bank account the fingerprint links to
	 * 
	 * @return the bank account
	 */
	public Account getRelatedAccount(){
		return relatedAccount;
	}
	
}
