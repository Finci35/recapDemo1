package singleton;

public class Singleton {
	
	public int value;
	public String meta;
		
	public static Singleton singleton = null;
	
	
	
	public Singleton(int value, String meta) {
		this.value = value;
		this.meta = meta;
	}
	
	public static void create(int value, String meta) {
		
		if(Singleton.singleton == null) {
			
			System.out.println("Objekt kann erstellt werden");
			Singleton.singleton = new Singleton(value, meta);
			
		} else {
			System.out.println("Eine Instanz von Singleton existiert bereits!");
				
		}
		
	}

}
