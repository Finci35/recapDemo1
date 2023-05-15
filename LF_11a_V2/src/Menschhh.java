// Zu erstellen:
// Klasse Mensch, Klasse MenschTest
// Attribute der Klasse Mensch; name, vorname, haarfarbe
// Attribute sollen alle private sein, Setter und Getter sollen erstellt werden
// Ausgabe auf Objekt Mensch soll "Name, Vorname" erzeugen
// Mindestens 3 Konstruktoren sollen erstellt werden. KOnstruktoren sollen verkettet werden.

public class Menschhh {
	
	private String vorname;
	private String nachname;
	private String haarfarbe;

    
     // Konstruktoren;
    

/*3*/   public Menschhh() {
            this("unbekant", "unbekant");
        }
    
/*2*/   public Menschhh(String nachname) {
			this(nachname, "unbekant");
		}

/*1*/   public Menschhh(String nachname, String vorname) {
            this.nachname = nachname;
            this.vorname = vorname;
            this.haarfarbe = "unbehaart";
        }

    
    // toString
    public String toString() {
    	return this.nachname + ", " + this.vorname;
    }
    
    // Setter und Getter
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    
    public void setNachname(String nachname) {
        this.nachname = nachname;
        }
	
    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }
        
    public String getHaarfarbe() {
        return haarfarbe;
    }
	
    public String getVorname() {
        return vorname;
    }
    
    public String getNachname() {
        return nachname;
    }
	
	
/* /* /*	
	private String name;
    private String vorname;
    private String haarfarbe;

    // Konstruktoren;
    
/*1*   public Mensch(String name, String vorname, String haarfarbe) {
        this.name = name;
        this.vorname = vorname;
        this.haarfarbe = haarfarbe;
    }

/*2*   public Mensch(String name, String vorname) {
        this(name, vorname, "");
    }

/*3*   public Mensch(String name) {
        this(name, "", "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getHaarfarbe() {
        return haarfarbe;
    }

    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public String getFullName() {
        return name + ", " + vorname;

    }
*/
}
