package atm.parts;

public class Display{
	public Display() {
	}
	
	public void print(String toDisplay){
		System.out.println(toDisplay);
	}
	
	public void requestCard() {
		System.out.println("Veuillez insérer votre carte.");
	}
	
	public void requestFinger() {
		System.out.println("Veuillez poser votre doigt sur le lecteur d'empreinte.");
	}

	public void requestPIN() {
		System.out.println("Veuillez introduire votre code personnel (PIN)\n"
				+ "Appuyez sur ENTER lorsque vous aurez fini ou sur BACKSPACE pour effacer");
	}

	public void displayMenu(String whatToChoose, int numItems, String items[]) {
		System.out.println(whatToChoose);
		for (int i = 0; i < numItems; i++)
			System.out.println((i + 1) + ") " + items[i]);
	}

	public void reportCardUnreadable() {
		System.out.println("Désolé, votre carte n'a pas pu être lue\n"
				+ "Veuillez réessayer");
	}

	public void reportFingerUnreadable() {
		System.out.println("Désolé, votre empreinte n'a pas été reconnue.");
	}

	public void requestReEnterPIN() {
		System.out.println("Votre code n'est pas correct.\n" + "Veuillez réessayer");
	}
}