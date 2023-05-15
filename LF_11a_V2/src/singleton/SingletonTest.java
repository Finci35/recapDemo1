package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
	//	Singleton s1 = new Singleton(1, "A");
	//	Singleton s2 = new Singleton(2, "B");
		
		Singleton.create(2, "C");
		
		Singleton.create(3, "D");
		
		System.out.println(Singleton.singleton);
		
	}

}
