
public class Person { // Klasse
	
	// Sichtbarkeitsmodifikatoren: public, protected, default, private
	public String vorname;
	private String nachname;
	
	public void schlafen() { /*Method*/ // bei void keine Rückgabe
		System.out.println("Person schläft");
	}
	
	public void arbeiten() { /*Method*/
		System.out.println("Person arbeitet");
	}
	
	
	
	// Getter(get) & Setter(set)
	
	public void setNachname(String name) {
		String nachname = "Peter";
		this.nachname = name;
//"this" kullanılmazsa "PersonTest" class'ında ekrana yazdırmak isteyince nachname kısmında
//		"null" yazar.
	}
	
	public String getNachname() {
		return this.nachname;
	}

}
