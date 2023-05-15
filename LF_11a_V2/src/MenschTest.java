public class MenschTest {

  public static void main(String[] args) {
    Mensch a = new Mensch ("Angela", "Merkel", "Braun ");
    Mensch b = new Mensch ("Margrette", "Teacher");    
    Mensch c = new Mensch ("Donald");
    Mensch d = new Mensch ("ali", "veli", "kahverengi");
    
    System.out.println(a.getFullname());
    System.out.println(b.getFullname());
    System.out.println(c.getFullname());
    System.out.println();
    System.out.println(d.getFullname());
    System.out.println(d.getName());
    System.out.println(d.getHaarfarbe());
    
    System.out.println();
    
    a.setHaarfarbe("Schwarz");
    b.setName("Eisenere");
    b.setVorname("Lady");
    b.setHaarfarbe("Weiß");
    c.setVorname("Trump");
    
    System.out.println(a.getFullname()+ " " + a.getHaarfarbe());;
    System.out.println(b.getName() + " " + b.getVorname() + " " + b.getHaarfarbe());
    System.out.println(c.getFullname());
  }

}