package Vererbung;
public class Birke extends Baum{ // Vererbung extends ile yapılır. extends zum Vererben
	
	
	public Birke() {
		super(30); // super() ruft Konstuktor der Elternklasse auf.
	}
	
	
	public String toString() {
		System.out.println(super.toString()); // Ekrana "Baum" yazdırır.
		return "Birke";
	}
	
	public void output() {
		System.out.println(this.toString());  // Ekrana "Baum" ve "Birke" yazdırır.
		System.out.println(super.toString()); // Ekrana "Baum" yazdırır.
		
	}
	
	public void baumWaechst(double value) {
		
		this.hoehe += value;
	}

}
