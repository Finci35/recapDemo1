public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int sayi1 = 200;
        int sayi2 = 25;
        int sayi3 = 26;
        // SORU: En büyük sayıyı yazdır.
        // ÇÖZÜM:
        int enbuyuk = sayi1;

        if (enbuyuk < sayi2) {
            enbuyuk = sayi2;
        }
        if (enbuyuk < sayi3) {
            enbuyuk = sayi3;
        }
        System.out.println("En büyük = " + enbuyuk);

    }
}