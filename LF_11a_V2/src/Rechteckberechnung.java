import javax.swing.JOptionPane;

public class Rechteckberechnung {

	public static void main(String[] args) {
		
		double breite;
		double laenge;
		double umfang;
		double flaeche;
		
		laenge = 1;
		breite = 2;

		String eingabeLaenge = JOptionPane.showInputDialog("Geben Sie Länge an:");
		String eingabeBreite = JOptionPane.showInputDialog("Geben Sie Breite an:");
		
		try { // Versuche etwas zu machen.
			laenge = Double.parseDouble(eingabeLaenge);
			breite = Double.parseDouble(eingabeBreite);
		
		} catch(Exception ex) { // Fange einen möglihen Fehler ab.
			
			// ex.printStackTrace();
			System.out.println("Geben Sie bitte keine Buchstabe sondern eine Zahl!");
		}
				
		umfang = (2 * breite) + (2 * laenge);
		flaeche = breite * laenge;
		
		System.out.println(String.format("Der Umfang beträgt %.2f", umfang));
		System.out.println(String.format("Die Fläche beträgt %.2f", flaeche));
		
		JOptionPane.showMessageDialog(null, String.format("Umfang: %.2f Flaäche: %.2f", umfang, flaeche));
	}
}
