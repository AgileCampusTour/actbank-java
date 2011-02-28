package atm.parts;

public class Display{
	
	/* Constructor */
	
	public Display() {
	}
	
	/**
	 * Simply prints on the console
	 * 
	 * @param toDisplay is the String we want to see in the console
	 */
	public void print(String toDisplay){
		System.out.println(toDisplay);
	}
	
	/**
	 * Prints a message asking customer to insert his card in the ATM
	 */
	public void requestCard() {
		System.out.println("Veuillez insérer votre carte.");
	}
	
	/**
	 * Prints a message asking customer to put his finger on the ATM fingerprint reader
	 */
	public void requestFinger() {
		System.out.println("Veuillez poser votre doigt sur le lecteur d'empreinte.");
	}

	/**
	 * Prints a message requesting to enter the card PIN code
	 */
	public void requestPIN() {
		System.out.println("Veuillez introduire votre code personnel (PIN)\n"
				+ "Appuyez sur ENTER lorsque vous aurez fini ou sur BACKSPACE pour effacer");
	}
	
	/**
	 * Displays menu options
	 * 
	 * @param whatToChoose is a sentence given to present the choices
	 * @param numItems is the number of choices in the menu
	 * @param items is an array of options in the form of a String
	 */
	public void displayMenu(String whatToChoose, int numItems, String items[]) {
		System.out.println(whatToChoose);
		for (int i = 0; i < numItems; i++)
			System.out.println((i + 1) + ") " + items[i]);
	}

	/**
	 * Prints a message saying the card inserted is not readable
	 */
	public void reportCardUnreadable() {
		System.out.println("Désolé, votre carte n'a pas pu être lue\n"
				+ "Veuillez réessayer");
	}

	/**
	 * Prints a message saying the finger can not be read
	 */
	public void reportFingerUnreadable() {
		System.out.println("Désolé, votre empreinte n'a pas été reconnue.");
	}

	/**
	 * Prints a message requesting the user to try again his PIN 
	 */
	public void requestReEnterPIN() {
		System.out.println("Votre code n'est pas correct.\n" + "Veuillez réessayer");
	}
}