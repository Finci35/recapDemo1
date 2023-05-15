package staticContext;

public class StaticContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticContext sv = new StaticContext();
		
		sv.s = "Hallo";
		
		System.out.println(sv.s);
		
		StaticContext.value = 42;
		System.out.println(StaticContext.value);
		
		sv.value = 43;
		System.out.println(StaticContext.value);
		
		sv.addValue(7);
		System.out.println(StaticContext.value);
		
		StaticContext sv2 = new StaticContext();
		
		sv2.addValue(50);
		
		System.out.println(sv.value);
		System.out.println(sv2.value);
		
		StaticContext.macheetwas();
	

	}

}
