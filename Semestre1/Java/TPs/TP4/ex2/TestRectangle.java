public class TestRectangle {
  public static void main(String[] args) {
    Point p = new Point(0, 0);
    Rectangle r = new Rectangle(p, 5, 4);
    r.afficher();
    Point q = new Point(5, -4);
    System.out.println(r.appartient(q));
  }
}
