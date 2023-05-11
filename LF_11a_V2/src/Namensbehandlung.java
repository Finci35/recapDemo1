import javax.swing.JOptionPane;
public class Namensbehandlung {
	
	// Eingabe über InputDialaog -> Name: mAx mUsTeRmaNn
	// 						am Ende => Max Musterman
	// Binderstrich'ten sonra da büyük harf ile başlayacak.
	// Birden fazla soyisim varsa onlarda aynı şekilde düzelecek.
	
	// indexOf metodu kullanılabilir. Ne olduğuna bak.

	public static void main(String[] args) {

/*		// Kullanıcıdan bir isim ve soyisim girişi al
        String input = JOptionPane.showInputDialog(null, "İsim ve soyisim girin:");

        // İsim ve soyisimleri ayırmak için boşluk karakterine göre böl
        String[] parts = input.trim().split(" ");
        System.out.println(input);

        // İsim ve soyisimleri baş harfi büyük diğer harfler küçük şekilde düzenle
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
   //         System.out.println(part);

            // İlk harf büyük, diğer harfler küçük olacak şekilde düzenle
            part = part.toLowerCase();
            part = Character.toUpperCase(part.charAt(0)) + part.substring(1);
   //         System.out.println(part);

            // Bindestrich (-) varsa, sonraki kelimenin ilk harfi büyük olacak şekilde düzenle
            int bStrichIndex = part.indexOf("-");
            if (bStrichIndex >= 0 && bStrichIndex < part.length() - 1) {
                part = part.substring(0, bStrichIndex + 1) +
                    Character.toUpperCase(part.charAt(bStrichIndex + 1)) +
                    part.substring(bStrichIndex + 2);
            }
            System.out.println(bStrichIndex);

            // İsim veya soyisim olarak düzenlenmiş part'ı parts dizisindeki ilgili indekse yaz
            parts[i] = part;
        }

        // İsim ve soyisimleri birleştirerek sonucu ekrana yazdır
        String output = String.join(" ", parts);
        JOptionPane.showMessageDialog(null, "Düzenlenmiş isim ve soyisim: " + output);
  */
		
	//	ALTERNATIF:
			
		//	String name = JOptionPane.showInputDialog("Bitte Name eingeben:");
			String name = "mAX mUsTeRmANn";
			name= name.trim();
			
			name = name.toLowerCase();
			
			System.out.println(name);
			
			name = name.substring(0,1).toUpperCase() + name.substring(1);
			
			System.out.println(name);
			
			int pos = name.indexOf(' ');
			
			System.out.println(pos);
			
			StringBuilder sb = new StringBuilder(name);
			
			String firstLast = name.substring(pos + 1, pos + 2);
			
			System.out.println(firstLast);
			
			name = name.substring(0, pos + 1) + name.substring(pos + 1, pos + 2).toUpperCase() + name.substring(pos + 2);
			
			System.out.println(name);
			//sb.setCharAt(pos + 1, );
    }

}
