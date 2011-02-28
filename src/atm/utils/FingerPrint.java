package atm.utils;

public class FingerPrint {
	
	private int sequenceNbr;
	private Account relatedAccount;
	
	public FingerPrint(int sequenceNbr, Account relatedAccount){
		this.sequenceNbr = sequenceNbr;
		this.relatedAccount = relatedAccount;
	}
	
	public int getSequence(){
		return sequenceNbr;
	}
	
	public Account getRelatedAccount(){
		return relatedAccount;
	}
	
}
