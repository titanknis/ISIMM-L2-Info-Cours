public class TestCercle {
  public static void main(String[] args) {
    Cercle c0 = new Cercle();
    Cercle c1 = new Cercle(new Point(1, 2), 4.5);
    c0.afficher();
    c1.afficher();

    System.out.println(c0.surface());
    System.out.println(c0.perimetre());

    System.out.println();

    System.out.println(c1.surface());
    System.out.println(c1.perimetre());
  }
}
