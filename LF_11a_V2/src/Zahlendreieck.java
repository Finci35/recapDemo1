
public class Zahlendreieck {

	public static void main(String[] args) {
		
		int i = 1;
		String schleife = "0 ";
		
		while ( i < 10) {
			schleife += i + " ";  
			System.out.println(schleife);
			i++;
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		for(int z=0; z<10; z++) {
			for(int s = 0; s - 1 < z; s++) {
				System.out.print(s + " ");
			}
			System.out.println();					
		}
		
	}

}
