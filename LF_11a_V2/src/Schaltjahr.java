import javax.swing.JOptionPane;

public class Schaltjahr {

	public static void main(String[] args) {
		
		
		int jahr = 0;
		
		String eingabe = JOptionPane.showInputDialog(null, "Bitte gib eine Jahreszahl ein:");
		
		try {
			
			jahr = Integer.parseInt(eingabe);
			
		} catch(NumberFormatException ex) {
			System.out.println("Achtung! Die Eingabe ist nicht korrekt!");
		}
		
		
		// Version 1
		if(jahr % 400 == 0) {
			
			System.out.println("Schaltjahr");
			
		} else if(jahr % 4 == 0) {
			
			if(jahr % 100 != 0) {
				
				System.out.println("Schaltjahr");
				
			} else {
				
				System.out.println("Kein Schaltjahr");
			}
				
		} else {
			
			System.out.println("Kein Schaltjahr");
			
		}
		
		
		// Version 2
		if(jahr % 400 == 0) {
			System.out.println("Schaltjahr");
		} else if(jahr % 4 == 0 && jahr % 100 != 0) {
			System.out.println("Schaltjahr");
		} else {
			System.out.println("Kein Schaltjahr");
		}
		
		// Version 3
		if(jahr % 400 == 0 || (jahr % 4 == 0 && jahr % 100 != 0)) {
			System.out.println("Schaltjahr");
		} else {
			System.out.println("Kein Schaltjahr");
		}
		
		// Version 4
		
		// Tenärer Operator: <Bedingung> ? <true> : <false> 
		String result = (jahr % 400 == 0 || (jahr % 4 == 0 && jahr % 100 != 0)) ? "Schaltjahr" : "Kein Schaltjahr";  
		
		
		System.out.println(result);
		
		
		

	}

}
