package Vererbung;

public class BaumTest {

	public static void main(String[] args) {
		
		Baum b = new Baum();
				
		b.setHoehe(30);
		
		System.out.println(b.getHoehe());
		
		Birke bi = new Birke();

		bi.setHoehe(30);
		
		System.out.println(bi.getHoehe());
		
	}

}
