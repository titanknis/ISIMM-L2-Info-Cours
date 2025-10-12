public class Cercle {
  Point centre;
  double rayon;

  public Cercle(Point p, double rayon) {
    this.centre = p;
    this.rayon = rayon;
  }

  public Cercle() {
    this.centre = new Point(0, 0);
    this.rayon = 1;
  }

  public void afficher() {
    System.out.print("centre = ");
    centre.afficher();
    System.out.println("rayon = " + rayon);
  }

  public double surface() {
    return rayon * rayon * Math.PI;
  }

  public double perimetre() {
    return 2 * Math.PI * rayon;
  }
}
