package listen;

public class Luhn_Algorithmus_mit_Lehrer {

	public static void main(String[] args) {
		
		String kknummer = "2718281828458567"; // Kreditkartennummer
						   
		String[] kknummerA = kknummer.split(""); // Wandle die Zeichenkette in Array um
		
		//for(String x : kknummerA) System.out.println(x);
		
		int laenge = kknummerA.length; // L�nge der Kreditkartenummer als Array
		
		int pruefziffer = Integer.parseInt(kknummerA[laenge - 1]); // Pr�fziffer: letztes Element im Array
		//System.out.println(pruefziffer);
		int odd = 0;
		int even = 0;
		int qsum = 0;
		int sum = 0;
		int sumO = 0;
		int sumE = 0;
		int sumA = 0;
		int dec = 0;
		
		 for(int i = 0; i < laenge - 1; i++) {
			  
			 if((i + 1) % 2 == 0) {
				 // Schritt 3:
				 sumE += Integer.parseInt(kknummerA[i]);
				 
			 } else {
				 // Schritt 1:
				 sum = Integer.parseInt(kknummerA[i]) * 2;
				 
				 // Schritt 2
				 if(sum <= 9) {
					 qsum = sum;
				 } else {
					 qsum = sum - 9;
				 }
				 
				 sumO += qsum;
			 }
		 }
		 
		 
		 System.out.println(sumO);
		 System.out.println(sumE);
		 
		 // Schritt 4
		 sumA = sumO + sumE;
		 
		 System.out.println(sumA);
		 
		 // Schritt 5
		 if(sumA % 10 != 0) {
			 dec = sumA + (10 - sumA % 10);
		 } else {
			 dec = sumA;
		 }
		 
		 System.out.println(dec);
		 
		 // Schritt 6
		 if(dec - sumA == pruefziffer) {
			 System.out.println("Korrekt");
		 } else {
			 System.out.println("Inkorrekt");
		 }

	}

}
