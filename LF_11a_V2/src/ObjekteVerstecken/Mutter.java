package ObjekteVerstecken;

public class Mutter {
	
	private String vorname;
	private String nachname;
	
	private Kind kind = new Kind();

	
	public void gibDemKindEinenNamen(String name) {
		this.kind.setVorname(name);
	}
	
	public String desKindesName() {
		return this.kind.getVorname();
	}
	
	
	
	
	
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	
	
	
	


}
