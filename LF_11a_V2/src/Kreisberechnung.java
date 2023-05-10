import javax.swing.JOptionPane;

public class Kreisberechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Deklaration (Değişkenin tanımlanmasına denir)
		double radius;
		double umfang;
		double flaeche;
		// double radius, umfang, flaeche;
		
		// Initalisierung (erstmaliges Wert. Değişkene ilk değer atanmasına denir.)
		radius = 0;
		
		String eingabe = JOptionPane.showInputDialog("Geben Sie einen Radius ein:");
		// Üstteki kod ile kullanıcıdan bir veri girmesini istiyoruz.
		System.out.println(eingabe); //Bu kod kullanıcının girdiği veriyi aşağıya yazdırıyor.
		
		//radius = Double.parseDouble(eingabe); // Explizite Typkonvertierung (Açık tip dönüştürme)
		/* Büyük harf ile başlayan Double bir class'tır. Aynı zamanda veri tipidir.
		// Burada kullanıcı sayı değil de harflerden oluşan bir veri girerse kullanıcının anlamayacağı
		bir hata ortaya çıkıyor. 
		Bu hatayı mesaja dönüştürüp, kullanıcının anlamasını sağlamak için "try" kullanılır.*/
		//System.out.println(radius);
		
		try { // Versuche etwas zu machen.
			radius = Double.parseDouble(eingabe); /*Bu kod, "eingabe" adlı bir string değişken içinde depolanan
			sayısal bir değeri çift hassasiyetli bir kayan nokta sayısına dönüştürür ve "radius" adlı bir double
			değişkenine atar. Bu tür dönüşümler genellikle kullanıcı girişi veya veritabanından alınan veriler gibi
			dış kaynaklardan alınan verileri programın kullanabileceği bir formata dönüştürmek için kullanılır.*/
			System.out.println(radius);
		} catch(Exception ex) { // Fange einen möglihen Fehler ab.
			
			// ex.printStackTrace();
			System.out.println("Ups. Hier hat wohl etwas nicht funktioniert!");
			
		}finally { // wird immer ausgeführt.
			
			//System.out.println("Finaly wird immer ausgeführt");
		}
		
		umfang = 2 * 3.1415926 * radius; // Literal
		umfang = 2 * Math.PI * radius;
		
		System.out.println(umfang);
		
		//System.out.println(Math.PI);
		
		flaeche = Math.PI * radius * radius;
		flaeche = Math.PI * Math.pow(radius, 2);
		
		System.out.println(flaeche);
		System.out.println(String.format("Bei einem radius von %.2f beträgt die Fläche: %.2f", radius, flaeche));
		// birinci %.2f radius'u, ikinci %.2f flaeche'yi çekiyor.
		//% Platzhalter. 2f ise virgülden sonra kaç basamak gösterileceğini belirtir.
		
		JOptionPane.showMessageDialog(null, String.format("Umfang: %.2f Flaäche: %.2f", umfang, flaeche));
		// Sonucu metin kutusunda gösterir.
				
	}

}
