
public class Kontrollstrukturen {

	public static void main(String[] args) {
		
		int zahl = 242;
		
		// Vergleichsoperatoren: <, >, <=, >=, !=, ==
		// Negationsoperator: !
		
		if(zahl <= 100) {
			System.out.println("Zahl ist kleiner als 100");
		} else if(zahl < 200) {
			System.out.println("Zahl ist kleiner als 200");
		} else {
			System.out.println("Zahl ist größer als 100");
		}
		
		// SWITCH
		
		int number = 13;
		switch(number) {
		case 1: System.out.println("Number ist 1");
		break;
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("Number ist kleiner als 10 aber nicht 1");
		break;
		
		case 13: System.out.println("Number ist 13");
		break;
		default: System.out.println("Number ist eine andere Zahl");
		}
		
		
		
		
		// SCHLEIFEN
		// While
		
		zahl = 5;
		while(zahl >= 0) {
			System.out.print(--zahl + " ");
			//zahl++; // Post-Inkrement-Operator - Burada sayı sıralanmaya 5 ile başlar.
			//++zahl; // Prä-Inkrement-Operator - Burada sayı sıralanmaya 6 ile başlar.
			
			// zahl--; // Post-Dekrement-Operator - Burada sayı sıralanmaya 5 ile başlar.
			// --zahl; // Prä-Dekrement-Operator - Burada sayı sıralanmaya 4 ile başlar.
		}
		
		System.out.println();
		
		do {
			System.out.println(zahl++);
		} while(zahl < 3);
		
		// for(Startwert; Endbedingung; Schrittweite)
		for(int i = 1; i <11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Sprunganweisung break und continue
		
		for(int i = 1; i <11; i++) {
			if(i % 2 != 0) {
				continue; // Beende die aktuelle Iteration und fahre mit der nächsten fort.
			}
			
			if(i == 6) {
				break; // Beende die komplette Schleife
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// outer und inner sind Labels; Benennung nach Belieben
		
		katze: for(int i = 1; i < 6; i++) { // Bu dış döngü
			System.out.println("i: " + i);
			inner: for(int j = 30; j <36; j++) { // Bu iç döngü
				if(j == 33) {
					continue katze;
				}
				System.out.print("j: " + j + " ");
			}
			System.out.println();
/*Bu kod, iki adet for döngüsü kullanarak bir metin çıktısı oluşturur. Kodda, birinci döngü "katze" olarak adlandırılmıştır ve 1'den 5'e kadar sayıları dolaşır.
  İkinci döngü ise "inner" olarak adlandırılmıştır ve 30'dan 35'e kadar sayıları dolaşır.

İkinci döngüde, eğer j değeri 33'e eşit olursa "continue katze" ifadesi çalıştırılır ve bu durumda içteki döngüde kalan işlemler atlanır, 
katze döngüsü devam eder ve bir sonraki i değerine geçilir. Eğer j değeri 33'e eşit değilse, "j: " + j + " " ifadesi yazdırılır ve bir sonraki j değeri için döngü devam eder.

İlk döngü her çalıştığında, "i: " + i ifadesi yazdırılır ve sonra içteki döngüdeki işlemler gerçekleştirilir. 
Eğer içteki döngü tamamlanırsa, alt satıra geçilir ve bir sonraki i değeri için döngü devam eder.

Sonuç olarak, bu kod, 1'den 5'e kadar sayıları ve 30'dan 35'e kadar olan sayıları yazdırır. 
Ancak, içteki döngüde j değeri 33'e eşit olduğunda, o i değeri atlanır ve bir sonraki i değeri için işlem devam eder.*/
		}

	} // EO main

} // EOC
