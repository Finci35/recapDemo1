package ubungen;

public class ubung {

	public static void main(String[] args) {
		
		String[ ] table = {"aa","bb","cc"}; 
		for(String s: table){ 
			int i =0; 
			while(i<table.length){ 
				System.out.println(s + ": " +i);
				i++; 
			} 
		} 
	}

}
