package listen;

public class Luhn_Algorithmus {
	
	public static boolean Prüfziffernberechnung(String Kreditkartennummer) {
        int summe = 0;
        boolean ungerade = false;
        
        // Schritt 1 und 3
        for (int i = Kreditkartennummer.length() - 1; i >= 0; i--) {
            int ziffer = Integer.parseInt(Kreditkartennummer.substring(i, i + 1));
            //Schritt 1
            if (ungerade) {
                ziffer *= 2;
             // Schritt 3
                if (ziffer > 9) {
                    ziffer = (ziffer % 10) + 1;
                }
            }
            
            summe += ziffer;
            ungerade = !ungerade;
        }
        
        // Schritt 2 und 4
        if (summe % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
	
	public static void main(String[] args) {
		String Kreditkartennummer = "2718281828458567";
        boolean isValid = Prüfziffernberechnung(Kreditkartennummer);
        System.out.println(isValid);
	}

	
/*
 yukarıdaki Java programı adım adım şu şekilde çalışır:

1. `LuhnAlgorithm` adında bir sınıf tanımlanır.
2. `checkCreditCardNumber` adında bir static metot tanımlanır. Bu metot, bir `String` tipinde kredi kartı numarası alır ve sonucu `boolean` tipinde döndürür.
3. `summe` ve `ungerade` isimli iki değişken tanımlanır. `summe` değişkeni sonucun tutulacağı değişken olacaktır, `ungerade` değişkeni ise, `ziffer` değişkeninin 2 ile çarpılması gerekip gerekmediğini belirleyen bir değişkendir.
4. For döngüsü, verilen kredi kartı numarasının her bir basamağına sırayla erişmek için kullanılır. Döngü, kredi kartı numarasının sağdan sola doğru taranması için kullanılır.
5. Döngünün her adımında, `digit` adında bir değişken tanımlanır ve kredi kartı numarasının o anki basamağına eşitlenir.
6. Döngüdeki `if` bloğu, `alternate` değişkeninin `true` olup olmadığını kontrol eder. `alternate` değişkeni, sırayla çift ve tek basamaklı sayıları işlemek için kullanılır.
7. Eğer `alternate` değişkeni `true` ise, `digit` değişkeni 2 ile çarpılır. Bu, Luhn algoritmasının 1. adımına karşılık gelir.
8. Eğer `digit` 9'dan büyük ise, 9'a göre modu alınarak 1 eklenir. Bu, Luhn algoritmasının 1. adımının bir parçasıdır.
9. `sum` değişkenine `digit` eklendiği için, `sum` değişkeni kredi kartı numarasının rakamlarının toplamını tutar.
10. `alternate` değişkeni, `!alternate` ifadesi ile tersine çevrilir. Bu, Luhn algoritmasının 3. adımı için gereklidir.
11. For döngüsü sona erdiğinde, kredi kartı numarasının tüm rakamları üzerinde işlem yapılmış olur ve `sum` değişkeni, Luhn algoritmasının 2. adımındaki işlemi temsil eder.
12. `if` bloğu, `sum` değişkeninin 10'a bölümünden kalanın 0 olup olmadığını kontrol eder. Eğer kalan 0 ise, kredi kartı numarası Luhn algoritmasına göre geçerlidir. Bu durumda, metot `true` döndürür.
13. Eğer kalan 0 değilse, kredi kartı numarası Luhn algoritmasına göre geçersizdir. Bu durumda, metot `false` döndürür.

`main` metodu
, programı test etmek için kullanılır. Örnek bir kredi kartı numarası ("2718281828458567") kullanarak checkCreditCardNumber metodunu çağırır ve sonucu ekrana yazdırır. Bu örnekte, çıktı olarak true değeri alınmalıdır çünkü örnekteki kredi kartı numarası Luhn algoritmasına göre geçerlidir.
 
 * */
	
	
	
	
	
}
