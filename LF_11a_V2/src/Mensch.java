
// Zu erstellen:
// Klasse Mensch, Klasse MenschTest
// Attribute der Klasse Mensch; name, vorname, haarfarbe
// Attribute sollen alle private sein, Setter und Getter sollen erstellt werden
// Ausgabe auf Objeklt Mensch soll "Name, Vorname" erzeugen
// Mindestens 3 Konstruktoren sollen erstellt werden. KOnstruktoren sollen verkettet werden.
public class Mensch {

  private String name;
  private String vorname;
  private String haarfarbe;
  
  public Mensch (String name, String vorname, String haarfarbe) {
    this.name = name;
    this.vorname = vorname;
    this.haarfarbe = haarfarbe;
  }
  
  public Mensch (String name, String vorname) {
    //this.name = name;
    //this.vorname = vorname;
    this(name,vorname,"");
  }
  
  public Mensch (String name) {
    //this.name = name;
    //this.vorname = vorname;
    this(name,"","");
  }
  
  
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setVorname(String vorname) {
    this.vorname = vorname;
  }
  
  public String getVorname() {
    return vorname;
  }
  
  public void setHaarfarbe(String haarfarbe) {
    this.haarfarbe = haarfarbe;
  }
  
  public String getHaarfarbe(){
    return haarfarbe;
  }
  
  public String getFullname() {
    return name + " " + vorname;
  }
}