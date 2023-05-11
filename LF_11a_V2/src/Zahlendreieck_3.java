
public class Zahlendreieck_3 {

	public static void main(String[] args) {
		
		int satirSayisi = 5;
				
		for(int satir = 0; satir < satirSayisi; satir++) { //Kaç satır olacağını belirtir.
			
			for(int bosluk = 0; bosluk < satirSayisi - (satir+1); bosluk++) { // Her satırdaki boşluk sayısı
				System.out.print(" ");
			}
			
			for(int yildiz = 0; yildiz < 1 +(satir*2); yildiz++) { //Her satırdaki yıldız sayısı.
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
