import javax.swing.JOptionPane;

public class GrößterGemeinsamerTeiler {

	public static void main(String[] args) {
		
		int m, n, r;
		m = 0;
		n = 0;
		
		
		String eingabem = JOptionPane.showInputDialog("Geben Sie die erste Zahl;");
		String eingaben = JOptionPane.showInputDialog("Geben Sie die zweite Zahl;");
		
		try {
			m = Integer.parseInt(eingabem);
			n = Integer.parseInt(eingaben);
		}catch(Exception ex) {
			System.out.println("Geben Sie bitte richtige Zahl!");
		} 
		
		r = m % n;
		
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		System.out.println(n);

	}

}
