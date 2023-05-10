import javax.swing.JOptionPane;

public class Kapitalverdoppelung {

	public static void main(String[] args) {
		
		double kapital = 0;
		double kapitalverlauf = 0;
		double zinssatz = 0;
		int jahre = 0;
		
//		String eingabeSK = JOptionPane.showInputDialog("Geben Sie das Startkapial ein:");
//		String eingabeZS = JOptionPane.showInputDialog("Geben Sie den Zinssatz ein:");
		
		try {
			kapital = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie das Startkapial ein:"));
			zinssatz = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Zinssatz ein:"));
			kapitalverlauf = kapital;
			
			do {
				kapitalverlauf = kapitalverlauf * (1 + zinssatz / 100);
				jahre++;
			} while(kapitalverlauf < kapital * 2);
			
			System.out.println("Startkapital : " + kapital);
			System.out.println(String.format("Endbetrag: %.2f nach %s Jahren", kapitalverlauf, jahre));
			
		} catch(Exception ex) {
			System.out.println("Geben Sie bitte richtige Zahl");
		}
		
		
	}

}
