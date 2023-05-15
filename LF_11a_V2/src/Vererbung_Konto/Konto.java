// Attribute. Kontonummer: String, Kontostand: double
// Konstruktor: 2 Parameter() -> Kontonummer, Kontostand
// getKontostand, getKontonummer, einzahlen, auszahlen

// Girokonto erbt von konto und hat Attribut limit: double  //Wie viel darf überzogen werden, soll bei Auszahlung überprüft werden
// Konstruktor: 3 Parametern() -> Kontonummer, Kontostand, limit.
// getLimit, setLimit

// performant wie möglich

package Vererbung_Konto;

public class Konto {
	
	protected String kontonummer;
	protected double kontostand;
	
	// Konstruktoren:
	public Konto (String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}
	
	
		
	// Getter und Setter:
	public String getKontonummer() {
		return this.kontonummer;
	}

	public double getKontostand() {
		return this.kontostand;
	}
	
	// Methode
	public void einzahlen(double value) {
		this.kontostand += value;
	}
	
	public boolean auszahlen(double value) {
		this.kontostand -= value;
		return true;
	}
	

}
