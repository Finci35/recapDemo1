import javax.swing.JOptionPane;

public class quatratberechnung {

	public static void main(String[] args) {
		
		double seiten = 1;
		double umfang = 1;
		double flaeche = 1;
		
		String eingabe = JOptionPane.showInputDialog("Geben Sie seiten ein");
		
		try {
			seiten = Double.parseDouble(eingabe);
		} catch(Exception ex) {
			System.out.println("Geben Sie bitte eine Zahl!");
		}
		
		umfang = 4 * seiten;
		flaeche = seiten * seiten;
		
		System.out.println(String.format("Der Umfang beträgt %.2f, die Fläche beträgt %.2f", umfang, flaeche));
		
		JOptionPane.showMessageDialog(null, String.format("Umfang: %.2f, Fläche: %.2f", umfang, flaeche));

	}

}
