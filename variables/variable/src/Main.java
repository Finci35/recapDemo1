public class Main {
    public static void main(String[] args) {
        int ogrenciSayisi = 11; // Burada "ogrenciSayisi" değişkenini tanımladık.
        // Değişken tanımlarken "camel casing" kullanılır.
        // Değişkendeki ilk keleminin ilk harfi küçük, diğer kelimelerin ilk harfi büyük
        // anlamına gelir.
        // REUSABILITY : Tekrar tekrar kullanılabilirlik demektir. Bir kere yaz, onu
        // heryerde kullan.

        String mesaj = "Ögrenci Sayısı :"; // Burada "mesaj" isminde bir değişken tanımladık.

        System.out.println("Ögrenci sayım : " + ogrenciSayisi);

        System.out.println(mesaj + ogrenciSayisi);

        System.out.println("Ögrenci sayım : 9");
        System.out.println("Ögrenci sayım : 9");
    }
}