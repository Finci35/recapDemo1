
public class Kreis {
	
	private double radius;
	
	// Konstruktoren werden ausgel�st bei Objekterstellung
	public Kreis(double radius) {
		this.radius = radius;
	}
	
	public Kreis() {
		// this nur ein einziges Mal im Konstruktor aufrufen!
		// this muss in der ersten Zeile stehen (mit Ausnahme)
		this("Hallo");
	}
	

	public Kreis(String radius) {
		
	}
	
	// Wird ausgelöst bei Ausgabe auf Objekt
	public String toString() {
		return "Radius: " + String.valueOf(this.radius);
	}
	
	// Flaeche nicht als Klassenvariable vorhanden; flaeche -> virtuelles Attribut
	public double getFlaeche() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	// Umfang nicht als Klassenvariable vorhanden; umfang -> virtuelles Attribut
	public double getUmfang() {
		return 2 * Math.PI * this.radius;
	}
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setRadius(String radius) throws Exception {
		this.radius = Double.parseDouble(radius);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
}
