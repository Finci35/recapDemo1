package staticContext;

public class StaticContext {
	
	public String s;
	
	public static double value;
	
	public void addValue(double value) {
		StaticContext.value += value;
	}
	
	public static void macheetwas(){
		System.out.println("Mache etwas");
		
	}

}
