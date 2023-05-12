//import javax.swing.JOptionPane;

public class Kapselung_KreisberechnungTest {
	
	public static void main (String[] args) {
		
		Kapselung_Kreisberechnung k = new Kapselung_Kreisberechnung();
		
//		double radius = 1;
//		try {
//			radius = Double.parseDouble(JOptionPane.showInputDialog("Radius:"));
//		} catch(Exception ex) {
//			System.out.println("Fehler!");
//		}

		try {
			k.getRadiusFromInput();			
		} catch(NumberFormatException ex) {
			System.out.println("Fehler!");
		}

//		k.setRadius(radius);
		
		System.out.println(k.getRadius());
		System.out.println(k.getUmfang());
		System.out.println(k.getFlaeche());
		
		
	}

}
