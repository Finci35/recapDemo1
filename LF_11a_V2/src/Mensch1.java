
public class Mensch1 {

	String vorname;
	
	public static void main(String[] args) {
		
		Mensch1 m1 = new Mensch1();
		
		System.out.println(m1); //Mensch@7dc5e7b4
		
		Mensch1 m2 = new Mensch1();
		m2.vorname = "Dieter";
		
		System.out.println(m2);
		
	}
	
	public String toString() {
		return vorname;
	}

}
