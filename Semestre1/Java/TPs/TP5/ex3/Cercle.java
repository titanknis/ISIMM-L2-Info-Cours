package ex3;

public class Cercle extends Ellipse {

  public Cercle(String nom, double rayon) {
    super(nom, rayon, rayon);
  }

  public String toString() {
    return super.toString().replace("Ellipse", "Cercle");
  }
}
