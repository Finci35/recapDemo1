
public class Stringbehandlung {

  public static void main(String[] args) {
    
    String text = "";
         text = "Hallo";
         
    String text2= new String("Hallo");
    
    System.out.println(text.length());  //Liefert die Anzahl der Zeichen in der Zeichenkette
    
    System.out.println(text.charAt(3)); //Liefert Zeichen  an einer bestimmen Indexposition
    
    System.out.println(text.toLowerCase()); // wandelt Zeichenkette in Kleinbuchstaben um
    
    System.out.println(text.toUpperCase()); // wandelt Zeichenkette in Großbuchstaben um
    
    System.out.println(text.substring(1,3)); //Erstellt Ausschnitt des ursprünlichen String
                         //Startindex: inklusive, Endindex: exklusive
    
    //Hallo
    //01234
    
    String a = new String ("Paul");
    String b = new String ("Paul");
    String c = a;
    System.out.println(a==b); // false);
    
    System.out.println(a==c); // true
    
    System.out.println(a.equals(b)); //true
    
    System.out.println(a.compareTo(b));
    
    
    String d = "Bert";
    String e = "Yasar";
    
    System.out.println(a.compareTo(d));
    System.out.println(a.compareTo(e));
    System.out.println(a.compareTo(b));
    
    String f = "Hallo ";
    String g = "Welt";
    
    System.out.println(f.concat(g));// Concat verkettet Zeichenketten, ahnlich wie +
    
    int zahl = 42;
    System.out.println(String.valueOf(zahl)); // Explizite Typkonverierung zu String
    
    // StringBuilder, StringBuffer
    
    StringBuilder sb = new StringBuilder();
    //StringBuilder sb1 = new StringBuilder("A");  
    
    sb.append("A"); // Append hängt Parameter an die Zeichenkette im Objekt an.
    sb.append("B");
/*
Bu kod, yeni bir `StringBuilder` nesnesi oluşturur ve bu nesnenin içine sırasıyla "A" ve "B" karakterlerini ekler. 
Yani `sb` adlı `StringBuilder` nesnesi şu an "AB" şeklinde bir karakter dizisi içermektedir.

`StringBuilder` sınıfı, karakter dizilerinin dinamik bir şekilde değiştirilmesine olanak tanıyan bir sınıftır. 
Bu nedenle `append` metodunu kullanarak `StringBuilder` nesnesinin sonuna yeni karakterler ekleyebilirsiniz.
Bu işlem, uzun ve karmaşık karakter dizilerinin oluşturulması veya değiştirilmesi için kullanışlı bir yoldur.
*/
    System.out.println(sb.toString()); // Erzeugt String aus stringBuilder-Objekt
/*
 Bu kod, StringBuilder sınıfından oluşturulan sb nesnesinin toString() yöntemini çağırarak,
 StringBuilder nesnesi içindeki karakter dizisini bir String nesnesine dönüştürür ve ekrana yazdırır.

Yukarıdaki örnek kodda, StringBuilder nesnesi olan sb, "A" ve "B" karakterlerini sırasıyla eklenmişti.
toString() yöntemi, sb nesnesinin içindeki karakter dizisini "AB" olarak döndürür.
Sonuç olarak, System.out.println() ifadesi bu "AB" String nesnesini ekrana yazdırır.
*/    
    
    System.out.println(sb.reverse()); // Dreht die Zeichenkette um.
    System.out.println(sb); //üstteki reverse komutu "sb.append" ile tanımlanan metni ters çevirdi.
/*
Bu kod, `StringBuilder` sınıfından oluşturulan `sb` nesnesinin `reverse()` yöntemini çağırarak,
`StringBuilder` nesnesi içindeki karakter dizisini ters çevirir ve ekrana yazdırır.

Yukarıdaki örnek kodda, `StringBuilder` nesnesi olan `sb`, "A" ve "B" karakterlerini sırasıyla eklenmişti. `reverse()` yöntemi, `sb` nesnesinin içindeki karakter dizisini tersine çevirir ve bu durumda "BA" olarak döndürür.

Sonuç olarak, `System.out.println()` ifadesi bu "BA" `StringBuilder` nesnesini ekrana yazdırır. `StringBuilder` nesnesinin kendisi de artık "BA" karakter dizisini tutmaktadır.
*/    
    
    System.out.println(sb.length()); // Länge der Zeichenkette
/*
 Bu kod, `StringBuilder` sınıfından oluşturulan `sb` nesnesinin `length()` yöntemini çağırarak, `StringBuilder` nesnesi içindeki karakter dizisinin uzunluğunu hesaplar ve ekrana yazdırır.

Yukarıdaki örnek kodda, `StringBuilder` nesnesi olan `sb`, "A" ve "B" karakterlerini sırasıyla eklenmişti ve `reverse()` yöntemi çağrılarak da karakter dizisi ters çevrilmişti. `length()` yöntemi, `sb` nesnesinin içindeki karakter dizisinin uzunluğunu hesaplar ve bu durumda 2 olarak döndürür.

Sonuç olarak, `System.out.println()` ifadesi bu 2 sayısını ekrana yazdırır.
 * */
    
    sb.setCharAt(0, 'Z'); // Ersetze ein Zeichen mit einem anderen an einer bestimmten Indexposition.
    System.out.println(sb);
/*
 Bu kod, StringBuilder sınıfından oluşturulan sb nesnesinin setCharAt() yöntemini kullanarak, StringBuilder nesnesi içinde belirtilen bir konumdaki karakteri değiştirir.

Yukarıdaki örnek kodda, sb.setCharAt(0, 'Z') ifadesi çalıştırılmıştır. Bu ifade, sb nesnesinin 0. indeksindeki karakteri 'Z' ile değiştirir. Yani, StringBuilder nesnesi artık "ZB" karakter dizisini tutmaktadır.
 * */
    
    sb.insert(1, 'x'); // Fügt Zeichen an Indexposition ein.
    System.out.println(sb);
    
    sb.insert(1, "XYZ"); // Fügt Zeichen an Indexposition ein.
    System.out.println(sb);
    
    sb.delete(1, 4); // Entfernt Sequenz aus dem StringBuilder-Objekt (Startindex: inklusive; Endindex: exklusive).
    System.out.println(sb);
    
  }

}

