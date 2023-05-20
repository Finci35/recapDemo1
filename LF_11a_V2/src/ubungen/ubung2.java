package ubungen;

public class ubung2 {

	public static void main(String[] args) {
		
		System.out.println("Result: " + 2 + 3 + 5);
		System.out.println("Result: " + 2 + 3 * 5);
		
		String color = "Red";
		switch (color) {
		  case "Red":
		      System.out.println("Found Red");
		  case "Blue":
		      System.out.println("Found Blue");
		      break;
		  case "White":
		      System.out.println("Found White");
		      break;
		  default:
		      System.out.println("Found Default");
		}
		
	
        
        String[] table = {"aa", "bb", "cc", "dd"};

        for(String s : table) {
            if ("bb".equals(s)) {
                continue;
            }
            System.out.println(s);
            if ("cc".equals(s)) {
                break;
            }
        }
        
        
        int num[] = {10, 15, 2, 17};
        int sum = 0;
        for (int number : num) {
		if (number % 2 != 0)
		  continue;
          sum += number;
          System.out.println(sum);
        }
        

        String[] cartoons = {"Tom", "Jerry", "Micky", "Tom"};
        int counter = 0;
        if ("Tom".equals(cartoons[0])) {
            counter++;
        } else if ("Tom".equals(cartoons[1])) {
            counter++;
        } else if ("Tom".equals(cartoons[2])) {
            counter++;
        } else if ("Tom".equals(cartoons[3])) {
            counter++;
        }
        System.out.println(counter);
        
        
        String[] table1 = {"aa", "bb", "cc"};

        for(String s: table1){
            int i = 0;
            while(i < table1.length){
                System.out.println(s + ": " + i);
                i++;
            }
        }
        
        int [] array = {1, 2, 3, 4, 5};

        for (int i: array) {
            if(i < 2) {
                continue;
            }
            System.out.println(i);
            if (i == 3) {
            	continue;
            }
        }
        System.out.println();
        
        int x = 2;
        int y = 3;
        int z = 4;
        
        int j= 0, k = 0;
        for ( int i=0; i < x; i++) {
          do {
            k = 0;
            while ( k < z ) {
              k++;
              System.out.print(k + " ");
            }
            System.out.println(" ");
            j++;
          } while ( j < y );
          System.out.println("---");
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("i = " + i);
            i = i + 1;
            System.out.println("i* = " + i);
        }
        
	}

}
