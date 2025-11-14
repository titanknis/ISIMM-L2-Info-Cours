package ex3;

public class Ellipse extends Forme2D {
  private double grandAxe;
  private double petitAxe;

  public Ellipse(String nom, double grandAxe, double petitAxe) {
    super(nom);
    this.grandAxe = grandAxe;
    this.petitAxe = petitAxe;
  }

  public double getGrandAxe() {
    return grandAxe;
  }

  public double getPetitAxe() {
    return petitAxe;
  }

  public double surface() {
    return Math.PI * grandAxe * petitAxe;
  }

  public String toString() {
    return super.toString()
        + " | Ellipse [grandAxe="
        + grandAxe
        + ", petitAxe="
        + petitAxe
        + ", surface="
        + String.format("%.2f", surface())
        + "]";
  }
}
