package Vererbung;

public class BaumTest {

	public static void main(String[] args) {
		
//		Baum b = new Baum();
//		b.setHoehe(20);
//		System.out.println(b.getHoehe());
		
		Birke bi = new Birke();
		bi.setHoehe(30);
		System.out.println(bi.getHoehe());
		
	//	System.out.println(bi);
		
		bi.output();
		bi.baumWaechst(10);
		
		Ulme u = new Ulme(30);
		
	//	System.out.println(u);
		
		//u.baumWaechst();
		
	}

}
