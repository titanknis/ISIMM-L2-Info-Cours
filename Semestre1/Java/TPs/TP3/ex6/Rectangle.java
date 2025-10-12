public class Rectangle {
  private double longeur;
  private double largeur;

  public Rectangle(double longeur, double largeur) {
    this.longeur = longeur;
    this.largeur = largeur;
  }

  public double surface() {
    return largeur * longeur;
  }

  public double perimetre() {
    return 2 * largeur + 2 * longeur;
  }

  public void afficher() {
    System.out.println("longeur = " + longeur);
    System.out.println("largeur = " + largeur);
    System.out.println("surface = " + surface());
    System.out.println("perimetre = " + perimetre());
    System.out.println();
  }
}
