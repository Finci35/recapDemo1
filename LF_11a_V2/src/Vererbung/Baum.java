package Vererbung;

public abstract class Baum { // abstract => Instanzen von Baum können nicht erstellt werden.
//public final class Baum { // final: diese Klasse kann nicht weiter vererben. final verhindert, dass die Klasse vererbt werden kann.
	
	protected String blattform; // protected olursa Baum class'ının çocukları olan Birke ve Ulme class'ları bu verilere ulaşabilir.
	protected double hoehe;
	protected String wurzelart;
	
	// Konstruktoren:
	public Baum(int hoehe) { // Eltern Klasse'de Konstruktor varsa bunun bir şekilde Kinder Klasselerde kullanılması gerekir.
		this.hoehe = hoehe;
	}
	
	// toString
	
	public String toString() {
		return "Baum";
	}
	
	
	// Getter und Setter
	public String getBlattform() {
		return blattform;
	}
	public void setBlattform(String blattform) {
		this.blattform = blattform;
	}
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public String getWurzelart() {
		return wurzelart;
	}
	public void setWurzelart(String wurzelart) {
		this.wurzelart = wurzelart;
	}
	
	

}
