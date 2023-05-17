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
		
		System. out. println() ; 
		
		StringBuilder sb = new StringBuilder(); 
		sb.append( "World" ); 
		sb.insert(0, "Hello " );
			System. out. println(sb) ; 
		

		System. out. println() ; 
		
		
		int []array = {1, 2, 3, 4, 5};

		for (int i: array) {
			if(i < 2) { 
				continue; 
			}
			System.out.print(i); 
			if (i == 3){
				continue; 
			}
			
		}
		
		System. out. println() ; 
		
		int iArray[] = {65, 68, 69};
		 
		iArray[2] = iArray[0]; 
		iArray[0] = iArray[1]; 
		iArray[1] = iArray[2]; 

		for (int element : iArray) { 
			System. out. print(element + " ");
		}
		
		System. out. println() ; 
		
		int num[] = { 10, 15, 2, 17}; 
		int sum = 0; 

		for (int number : num) {
			if (number % 2 != 0)
					continue; 
			sum += number;
		}
		System.out.println(sum);
		
		
		String[] table1 = {"aa", "bb", "cc", "dd"};

		for(String s : table1){
			if ("bb".equals(s)) {
				continue;
			}		
			System.out.println(s); 
			if ("cc" .equals(s)) { 
				break; 
			}
		}
		
	}
	
	
}

