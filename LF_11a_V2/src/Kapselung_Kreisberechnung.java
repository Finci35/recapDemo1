import javax.swing.JOptionPane;

public class Kapselung_Kreisberechnung {
				
		private double radius;
		private double umfang;
		private double flaeche;
				
		
		
		
		
		
		
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public double getRadius() {
			return radius;
		}
		
		public double getUmfang() {
			return umfang;
		}
		
		public double getFlaeche() {
			return flaeche;
		}
		
		public void berehnen() {
			umfang = 2 * Math.PI * radius;
			flaeche = Math.PI * Math.pow(radius, 2);
		}


}
		
		
		
		
		
		
/*		String eingabe = JOptionPane.showInputDialog("Geben Sie einen Radius ein:");
		
		System.out.println(eingabe); 
		
		try { 
			radius = Double.parseDouble(eingabe);
			System.out.println(radius);
		} catch(Exception ex) { 
						
			System.out.println("Ups. Hier hat wohl etwas nicht funktioniert!");
			
		}
		
		umfang = 2 * 3.1415926 * radius; 
		umfang = 2 * Math.PI * radius;
		
		System.out.println(umfang);
			
		flaeche = Math.PI * radius * radius;
		flaeche = Math.PI * Math.pow(radius, 2);
		
		System.out.println(flaeche);
		System.out.println(String.format("Bei einem radius von %.2f beträgt die Fläche: %.2f", radius, flaeche));
		
		
		JOptionPane.showMessageDialog(null, String.format("Umfang: %.2f Flaäche: %.2f", umfang, flaeche));
	
				

}
*/
