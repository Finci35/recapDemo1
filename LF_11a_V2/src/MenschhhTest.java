import javax.swing.JOptionPane;

public class MenschhhTest {

	public static void main(String[] args) {
		
		Menschhh m1 = new Menschhh();
        Menschhh m2 = new Menschhh("Mustermann");
        Menschhh m3 = new Menschhh("Musterman", "Max");
        
        System.out.println(m1); // Ausgabe: unbekant, unbekant
        System.out.println(m2); // Ausgabe: Mustermann, unbekant
        System.out.println(m3); // Ausgabe: Musterman, Max
        
        System.out.println(); //boşluk için
        
        System.out.println(m1.getHaarfarbe());
        System.out.println(m2.getHaarfarbe());
        System.out.println(m3.getHaarfarbe());

        System.out.println(); //boşluk için
        
		m1.setNachname("Paulsen");
		m1.setVorname("Bärbel");
		m1.setHaarfarbe("blond");
		
		System.out.println(m1);
		System.out.println(m1.getHaarfarbe());
		

/*		Mensch m1 = new Mensch("Friedrich", "Hans", "weiß");
        System.out.println(m1.getFullName()); // Ausgabe: Friedrich, Hans

        Mensch m2 = new Mensch("Meier", "Peter");
        System.out.println(m2.getFullName()); // Ausgabe: Meier, Peter

        Mensch m3 = new Mensch("Fatih");
        System.out.println(m3.getFullName()); // Ausgabe: Schmidt,

*/        
	}

}
