public class Rectangle {
  private Point sommet;
  private double longueur;
  private double largeur;

  public Rectangle(Point sommet, double longueur, double largeur) {
    this.sommet = sommet;
    this.longueur = longueur;
    this.largeur = largeur;
  }

  public Point getSommet() {
    return sommet;
  }

  public void setSommet(Point sommet) {
    this.sommet = sommet;
  }

  public double getLargeur() {
    return largeur;
  }

  public void setLongueur(double longueur) {
    this.longueur = longueur;
  }

  public void setLargeur(double largeur) {
    this.largeur = largeur;
  }

  public double getLongueur() {
    return longueur;
  }

  public double surface() {
    return longueur * largeur;
  }

  public double perimetre() {
    return 2 * (longueur + largeur);
  }

  public void afficher() {
    System.out.print("sommet = ");
    sommet.afficher();
    System.out.println("longueur = " + longueur);
    System.out.println("largeur = " + largeur);
  }

  public boolean appartient(Point p) {
    return (sommet.getX() <= p.getX() && p.getX() <= sommet.getX() + longueur)
        && (sommet.getY() >= p.getY() && p.getY() >= sommet.getY() - largeur);
  }
}
