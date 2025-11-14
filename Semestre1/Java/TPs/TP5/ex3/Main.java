package ex3;

public class Main {
  public static void main(String[] args) {
    Forme2D[] formes = new Forme2D[4];

    formes[0] = new Rectangle("Mon Rectangle", 5, 3);
    formes[1] = new Carre("Mon Carré", 4);
    formes[2] = new Ellipse("Mon Ellipse", 6, 3);
    formes[3] = new Cercle("Mon Cercle", 5);

    System.out.println("=== Liste des formes ===");
    for (Forme2D f : formes) {
      System.out.println(f.toString());
    }
  }
}
