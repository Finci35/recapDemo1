
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
/*
`substring()` yöntemi kullanılarak `text` değişkeninin belirtilen bir alt dizesi alınır ve ekrana yazdırılır.

`substring()` yöntemi, bir `String` nesnesinin belirli bir alt dizisini döndürmek için kullanılır. İlk parametre, alt dizenin başlangıç konumunu belirten bir tamsayıdır ve ikinci parametre, alt dizenin son konumunu belirten bir tamsayıdır (bu konum dahil değildir).

Yukarıdaki örnek kodda, `text.substring(1,3)` ifadesi çağrılmıştır. Bu ifade, `text` değişkeninin 1. konumundan başlayarak 3. konuma kadar olan (3. konum dahil değil) alt diziyi alır. Bu alt dize "al" olduğundan, `System.out.println()` ifadesi "al" `String` nesnesini ekrana yazdırır.
 * */
    
    //Hallo
    //01234
    
    String a = new String ("Paul");
    String b = new String ("Paul");
    String c = a;
    System.out.println(a==b); // false);
    
    System.out.println(a==c); // true
    
/*
 Bu kodda, önce `String` sınıfından `a` ve `b` olmak üzere iki yeni `String` nesnesi oluşturulur ve her biri "Paul" metnini içerir. Daha sonra, `c` değişkeni, `a` değişkeninin değerine atanır.

`==` operatörü, referansları karşılaştırmak için kullanılır. Bu nedenle, `a==b` ifadesi `false` sonucunu verir,
çünkü `a` ve `b` farklı referanslara sahip iki farklı `String` nesnesidir ve içerikleri aynı olsa bile, referansları farklıdır.

Öte yandan, `a` ve `c` aynı `String` nesnesine referans gösterdikleri için, `a==c` ifadesi `true` sonucunu verir.

Bu durum, `String` nesnelerinin nasıl çalıştığını anlamak açısından önemlidir.
`String` nesneleri immutable (değiştirilemez) olduğu için, bir `String` nesnesi oluşturulduktan sonra,
ona referans gösteren değişkenlerin içeriği değiştirilemez. Bu nedenle, iki `String` nesnesi aynı içeriğe sahip olsa bile, farklı referanslara sahip olabilirler.
 */
    
    System.out.println(a.equals(b)); //true
/*
equals() yöntemi, String nesnelerinin içeriklerinin karşılaştırılması için kullanılır.
İki String nesnesi aynı içeriğe sahipse, equals() yöntemi true sonucunu verir.
Bu nedenle, a ve b değişkenleri "Paul" metnini içerdiği için, a.equals(b) ifadesi true sonucunu verir.
*/
    
    System.out.println(a.compareTo(b));
/*
Bu kod, `String` sınıfından oluşturulan `a` ve `b` değişkenlerinin alfabetik olarak karşılaştırılması için `compareTo()` yöntemini kullanır ve sonucu ekrana yazdırır.

`compareTo()` yöntemi, iki `String` nesnesinin alfabetik olarak karşılaştırılması için kullanılır. Bu yöntem, karşılaştırılan iki `String` nesnesinin ilk karakterlerini karşılaştırır. Eğer karakterler aynıysa, ikinci karakterlere geçilir ve bu işlem devam eder. Eğer farklı bir karakter bulunursa, bu karakterlerin ASCII değerleri karşılaştırılır ve sonuç bu değere göre belirlenir. `compareTo()` yöntemi, bu karşılaştırmayı yaparak, karşılaştırılan `String` nesnelerinin sıralamasını belirler.

Eğer `a` ve `b` değişkenleri aynı metni içeriyorsa, `compareTo()` yöntemi `0` sonucunu verir. Eğer `a` değişkenindeki metin, `b` değişkenindeki metinden alfabetik olarak önce geliyorsa, `compareTo()` yöntemi negatif bir değer döndürür. Eğer `a` değişkenindeki metin, `b` değişkenindeki metinden alfabetik olarak sonra geliyorsa, `compareTo()` yöntemi pozitif bir değer döndürür.

Örneğin, `a` ve `b` değişkenleri "Paul" metnini içerdiği için, `a.compareTo(b)` ifadesi `0` sonucunu verecektir.
*/
    
    
    String d = "Bert";
    String e = "Yasar";
    
    System.out.println(a.compareTo(d)); // 14
    System.out.println(a.compareTo(e)); // -9
    System.out.println(a.compareTo(b)); // 0
    
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

