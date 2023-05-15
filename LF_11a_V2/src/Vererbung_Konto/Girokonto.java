
package Vererbung_Konto;


public class Girokonto extends Konto {

	private double limit; // Burada limit, Kontostand'ın ne kadar minus olacağını belirtiyor
			
	public Girokonto(String kontonummer, double kontostand, double limit) {
		super(kontonummer, kontostand);
		this.limit = limit;
	}
	
	public boolean auszahlen(double value) {
		if (this.kontostand - value >= limit * -1) {
	//	if (this.kontostand - value >= 0 && value <= limit) {
			super.auszahlen(value);
			return true;
		}
		return false;
	}	
	
	public double getLimit() {
		return this.limit;
	}
	
	public void setLimit(double value) {
		this.limit = value;
	}
	
}
