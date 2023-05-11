
public class Mensch {

	String vorname;
	
	public static void main(String[] args) {
		
		Mensch m1 = new Mensch();
		
		System.out.println(m1); //Mensch@7dc5e7b4
		
		Mensch m2 = new Mensch();
		m2.vorname = "Dieter";
		
		System.out.println(m2);
		
	}
	
	public String toString() {
		return vorname;
	}

}
