import javax.swing.JOptionPane;

public class Vokalzaehler {

	// Eingabe erzeugen mit Inputdialog
	// Zähle Vokale in dieser Zeichenkette A, E,I, O, U
	
	public static void main(String[] args) {
	
/*		String text = JOptionPane.showInputDialog("Geben Sie einen Text ein:");
		
		int zaehler = 0;
		for(int i=0; i<text.length(); i++) {
			char buchstabe = text.charAt(i);
			if(buchstabe == 'A' || buchstabe == 'a' ||
			   buchstabe == 'E' || buchstabe == 'e' ||
			   buchstabe == 'I' || buchstabe == 'i' ||
			   buchstabe == 'O' || buchstabe == 'o' ||
			   buchstabe == 'U' || buchstabe == 'u') {
				zaehler++;
			}
			System.out.print(buchstabe); // Metni yazdırmak için			
		}
		System.out.println(); // Bir satır boşluk vermek için.
		System.out.println("Anzahl der Vokale im Text: " + zaehler);
		JOptionPane.showMessageDialog(null, "Anzahl der Vokale im Text: " + zaehler);
*/		
		
		// ALTERNATIF 2;
		
		String eingabe = JOptionPane.showInputDialog("Geben Sie einen Text ein:");
		
		int laenge = eingabe.length();
		String eingabeLower = eingabe.toLowerCase();
		int counter = 0;
		
		for(int i=0; i < laenge; i++) {
			
			switch(eingabeLower.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': counter++;
			}		
		}
		System.out.println("Im Text: \"" + eingabe + "\" kommen " + counter + " Vokale vor.");
	}

}
