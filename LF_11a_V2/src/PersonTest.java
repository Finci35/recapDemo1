
public class PersonTest {

	public static void main(String[] args) {
		
		// Burada daha önce oluşturduğumuz Person class'ı ile bağlantı kuruyoruz.
		
		Person p1 = new Person(); // Person class ismidir. Onun için baş harfi büyük yazıldı.
		Person p2 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.vorname = "Getrude";		
//		p1.nachname = "Schulz";
		// Person class'ında "nachname"yi "private" olarak değiştirince burada hata verdi. 
		// Çünkü class haricinden bu bilgiye ulaşmaya çalışınca bunu engelleri. 
		p1.setNachname("Schulz");
		
		p2.vorname = "Paul";		
//		p2.nachname = "Becker";
		p2.setNachname("Becker");
		
		System.out.println(p1.vorname + " " + p1.getNachname());
		System.out.println(p2.vorname + " " + p2.getNachname());
		
		p1.arbeiten();
		p2.schlafen();

	}

}
