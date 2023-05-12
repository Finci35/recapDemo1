import javax.swing.JOptionPane;

public class Kapselung_Kreisberechnung {
				
		private double radius;
		
		
		
		
		public void getRadiusFromInput() throws NumberFormatException {
			
			this.radius = Double.parseDouble(JOptionPane.showInputDialog("Radius:"));
			
		}
		
		// Flaeche nicht als Klassenvariable vorhanden; flaeche -> virtuelles Attribut
		public double getFlaeche() {
			return Math.PI * Math.pow(this.radius, 2);
		}
		
		// Umfang nicht als Klassenvariable vorhanden; umfang -> virtuelles Attribut
		public double getUmfang() {
			return 2* Math.PI * this.radius;
		}
		
		// radius:
		public void setRadius(double radius) {
			this.radius = radius;
/*	 		"this.radius" yukarıda tanımlanan "private double radius"u belirtir.
			Diğer radius yeni ulşturulan bir tanımdır.
			Radius yerine başka bir isim de verilebilir. */
		}
		
		public double getRadius() {
			return this.radius;
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
