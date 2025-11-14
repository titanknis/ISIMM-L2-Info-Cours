package ex3;

public class Rectangle extends Forme2D {
  private double longueur;
  private double largeur;

  public Rectangle(String nom, double longueur, double largeur) {
    super(nom);
    this.longueur = longueur;
    this.largeur = largeur;
  }

  public double getLongueur() {
    return longueur;
  }

  public void setLongueur(double longueur) {
    this.longueur = longueur;
  }

  public double getLargeur() {
    return largeur;
  }

  public void setLargeur(double largeur) {
    this.largeur = largeur;
  }

  public double surface() {
    return longueur * largeur;
  }

  public String toString() {
    return super.toString()
        + " | Rectangle [longueur="
        + longueur
        + ", largeur="
        + largeur
        + ", surface="
        + surface()
        + "]";
  }
}
