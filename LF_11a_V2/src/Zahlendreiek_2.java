
public class Zahlendreiek_2 {

	public static void main(String[] args) {
		

 			System.out.println("----------------------------------------------------------------------------------------------------------");
	        System.out.println("Dik Üçgen");
	        
 			int r, t;//Değişkenlerimizi tanımladık.
	        int sembol=1;//Yıldızımızın program başlangıçında, kaç tane yıldız yazdıracağını belirtiriz. 
	        
	        for(t=0; t<9; t++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
	            for (r=0; r <sembol; r++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
	                System.out.print("*");//Sembolümüzü belirttik.
	            }
	            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
	            sembol++;//Yıldızımızın birer birer artmasını sağlarız.
	        } 

		System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Ters Dik Üçgen");
        
	        int x, y;//Değişkenlerimizi tanımladık.
	        int symbol=9;//Yıldız sembolümüzün program başlangıçında, 9 tane yıldız yazdıracağını belirtiriz. 
	        
	        for(y=0; y<9; y++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
	            for (x=0; x <symbol; x++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
	                System.out.print("*");//Sembolümüzü belirttik.
	            }
	            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
	            symbol--;//Yıldızımızın birer birer azalmasını sağlarız.
	        }
	        
	        System.out.println("----------------------------------------------------------------------------------------------------------");
	        System.out.println("Tam Üçgen");
	        
	        int i,j,k;//Değişekenlerimizi tanımladık.
	        for (i=1; i<10; i++) {//Döngümüzün ne kadar döneceğini belirtir.
	           for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
	               System.out.print(" ");//Boşluğumuzu belirtiyoruz.
	           }
	           for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
	               System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
	               System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar. 
	           }
	            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
	        }
	        
	        System.out.println("----------------------------------------------------------------------------------------------------------");
	        System.out.println("Ters Üçgen");
	        	        
	        int a,b,c;//Değişekenlerimizi tanımladık.
	        for (a=10; 0<a; a--) {//Döngümüzün ne kadar döneceğini belirtir.
	           for(b=a; b<10; b++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
	               System.out.print(" ");//Boşluğumuzu belirtiyoruz.
	           }
	           for (c=1; c<=a; c++) {//Yıldız sembolümüzün yazılmasını sağlar.
	               System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
	               System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar. 
	           }
	            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
	        }
	        
	}

}
