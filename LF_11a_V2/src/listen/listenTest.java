package listen;
import java.util.ArrayList;

public class listenTest {

	public static void main(String[] args) {
		
//		int anzahl = 42;
//		// Array;
//		String[] namen = new String[anzahl]; // erstellt einen Array aus Zeichenketen mit 42 Feldern. 
		
		// Array;
		String[] namen = new String[5]; // erstellt einen Array aus Zeichenketen mit 5 Feldern. 
		
		System.out.println(namen[0]); // Arrays sind 0-Indexiert.
		
		namen[1] = "Paul";
		namen[2] = "Peter";
		namen[4] = "Getrude";
		
		System.out.println(namen[4]);
		System.out.println(namen[namen.length - 1]); //dizinin son elemanını (yani dizinin boyutundan bir eksik olan son indeksi) ekrana yazdırır. Bu, "Getrude" adının yazdırılmasına neden olur.
		System.out.println(namen[namen.length / 2]); //"namen" dizisinin ortadaki elemanını (yani dizinin boyutunun yarısı) ekrana yazdırır. Bu durumda, dizinin boyutu beş olduğundan, ortadaki elemanın indeksi "2" olur. Bu eleman, kodda belirtilen "Peter" adıdır.
		
		for(String x : namen) { // enhanced for-loop
			System.out.println(x);
		}
		
		int[] zahlen = new int[] {1,2,3,4,5,6,7}; // klasisch
		int[] zahlen2 = {1,2,3,4,5,6,7,8,9}; // modern
		
		int count = zahlen.length; // Attribut der Klasse Array mit Anzahl derElemente.
		System.out.println(count);
		
		String[][] personen = new String[3][2]; // mehrdimensionaler Array (2-Dimensionen)
				
		// Ein Array kann immer nur von einem Datentyp sein.
		
		personen[0][1] = "Max";
		personen[0][1] = "Mustermann";
		
		personen[1][0] = "Jane";
		personen[1][1] = "Doe";
		
		System.out.println(personen[1][0]);
		
		String[][] values = new String[3][];
		// bei mehrdimensionaler Array muss nur die erste Dimension mit Länge deklariert werden.
		values[0] = new String[] {"Max", "Mustermann"};
		
		System.out.println(values[0][1]); // Mustermann
		
		// ----------------------------------------------------------------------------------------
		
		
		// ArrayList:
		
		ArrayList<String> names = new ArrayList<String>(); // Generischer Datentyp
		
		names.add("Peter"); // mit add können der ArrayList Elemente hinzugefügt werden.
		names.add("Annette");
		names.add("Horst");
		names.add("Bärbel");
		
		System.out.println(names.size()); // .size() ermittelt die Länger der ArrayList
		System.out.println(names.get(1)); // auswählen eines Elementes mit get() - ArrayList ist 0-indexiert.
		
		System.out.println(names.get(2));
		names.set(2, "Bernd");			//	mit set kann ein Element an einem bestimmten Index geändert werden.
		System.out.println(names.get(2));
		
		
		System.out.println(names.size());
		System.out.println(names.get(0));
		names.remove(0);					//	Entfernt Element an Index
		System.out.println(names.get(0));
		System.out.println(names.size());
		
		for(String s: names) {
			System.out.print(s + " ");
		}
		
		System.out.println(names.contains("Peter"));
	
		
		
		
		System.out.println(names.size());
		//names.clear();					//	Löscht alle Werte in der ArrayList
		System.out.println(names.size());
	}
	

}
