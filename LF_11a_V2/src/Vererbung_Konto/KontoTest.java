package Vererbung_Konto;

public class KontoTest {

	public static void main(String[] args) {
		
		Konto k = new Konto("00013068", 100);
		
		System.out.println("Kontonummer: " + k.getKontonummer());
		
		k.einzahlen(50);
		System.out.println(k.getKontostand());
		
		k.auszahlen(75);
		System.out.println(k.getKontostand());

		System.out.println("-----------------------------");
		
		Girokonto gk = new Girokonto("00013068", 100, 200);
		
		System.out.println(gk.auszahlen(300));
		System.out.println(gk.getKontostand());

		System.out.println(gk.auszahlen(100));
		System.out.println(gk.getKontostand());
		
		
	}

}
