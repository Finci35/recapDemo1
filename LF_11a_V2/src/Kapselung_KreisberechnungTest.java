import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Kapselung_KreisberechnungTest {
	
	public static void main (String[] args) throws Exception {
		
		Kapselung_Kreisberechnung k = new Kapselung_Kreisberechnung();
		System.out.println(k.getRadius());
		
		
//		double radius = 1;
//		try {
//			radius = Double.parseDouble(JOptionPane.showInputDialog("Radius:"));
//		} catch(Exception ex) {
//			System.out.println("Fehler!");
//		}

		try {
			k.setRadius(Double.parseDouble(JOptionPane.showInputDialog("Radius:")));			
		} catch(NumberFormatException ex) {
			System.out.println("Fehler!");
		}

		k.setRadius("5.0");
		
		System.out.println(k.getRadius());
		System.out.println(k.getUmfang());
		System.out.println(k.getFlaeche());
		
		
	}

}
