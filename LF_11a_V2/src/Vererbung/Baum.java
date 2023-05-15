package Vererbung;

public class Baum {
	
	protected String blattform; // protected olursa Baum class'ının çocukları olan Birke ve Ulme class'ları bu verilere ulaşabilir.
	protected double hoehe;
	protected String wurzelart;
	
	
	public String getBlattform() {
		return blattform;
	}
	public void setBlattform(String blattform) {
		this.blattform = blattform;
	}
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public String getWurzelart() {
		return wurzelart;
	}
	public void setWurzelart(String wurzelart) {
		this.wurzelart = wurzelart;
	}
	
	

}
