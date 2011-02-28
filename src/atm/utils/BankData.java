package atm.utils;

import java.util.HashMap;

public class BankData {
	
	Account account1 = new Account("Robert Jones", 111222333, new Money(2000));
	Account account2 = new Account("Phil Alberts", 111333444, new Money(4000));
	Account account3 = new Account("Terence Abitbol", 111444333, new Money(3500));
	
	Card card1 = new Card(4590, account1);
	Card card2 = new Card(3208, account2);
	Card card3 = new Card(4378, account3);
	
	FingerPrint finger1 = new FingerPrint(567829, account1);
	FingerPrint finger2 = new FingerPrint(267763, account2);
	FingerPrint finger3 = new FingerPrint(900982, account3);
	
	HashMap<String, Card> cardsMap = new HashMap<String, Card>();
	HashMap<String, FingerPrint> fingersMap = new HashMap<String, FingerPrint>();
	
	public BankData(){
		cardsMap.put("111111", card1);
		cardsMap.put("122221", card2);
		cardsMap.put("133331", card3);
		
		fingersMap.put("567829", finger1);
		fingersMap.put("267763", finger2);
		fingersMap.put("900982", finger3);
	}
	
	public HashMap<String, Card> cards(){
		return cardsMap;
	}
	
	public HashMap<String, FingerPrint> fingerPrints(){
		return fingersMap;
	}
}
