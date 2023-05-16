package listen;

public class Luhn_Algorithmus_mit_Lehrer_1 {
	
	String kknummer;
	String[] kknummerA;
	int laenge;
	int pruefziffer;
	
	public static void main(String[] args) {
		
		Luhn_Algorithmus_mit_Lehrer_1 luhn = new Luhn_Algorithmus_mit_Lehrer_1("2718281828458567");
		
		if(luhn.berechneKorrektheit()) {
			System.out.println("Korrekt");
		} else {
			System.out.println("Inkorrekt");
		}

	}
	
	public Luhn_Algorithmus_mit_Lehrer_1(String kknummer) {
		
		this.kknummer = kknummer;
		this.kknummerA = this.kknummer.split(""); // Wandle die Zeichenkette in Array um
		this.laenge = this.kknummerA.length; // L�nge der Kreditkartenummer als Array
		this.pruefziffer = Integer.parseInt(this.kknummerA[this.laenge - 1]); // Pr�fziffer: letztes Element im Array
		
	}
	
	public boolean berechneKorrektheit() {
		
		int qsum = 0;
		int sum = 0;
		int dec = 0;
		
		 for(int i = 0; i < this.laenge - 1; i++) {
			 
			 int digit = Integer.parseInt(this.kknummerA[i]);
			  
			 if((i + 1) % 2 == 0) {
				 // Schritt 3 & 4: 
				 sum += digit;
				 
			 } else {
				 // Schritt 1:
				 int odd = digit * 2;
				 // Schritt 2 & 4
				 qsum = (odd <= 9) ? odd : odd - 9;
				 sum += qsum;
			 }
		 }
		 
		 // Schritt 5
		 dec = (sum % 10 != 0) ? sum + (10 - sum % 10) : sum;
		 // Schritt 6
		return dec - sum == this.pruefziffer;
	
	}
}
