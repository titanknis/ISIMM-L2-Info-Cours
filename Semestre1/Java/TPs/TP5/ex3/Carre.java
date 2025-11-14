package ex3;

public class Carre extends Rectangle {

  public Carre(String nom, double cote) {
    super(nom, cote, cote);
  }

  public String toString() {
    return super.toString().replace("Rectangle", "Carre");
  }
}
