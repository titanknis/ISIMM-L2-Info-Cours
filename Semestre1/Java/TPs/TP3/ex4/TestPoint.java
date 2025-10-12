public class TestPoint {
  public static void main(String[] args) {
    Point P[] = new Point[100];
    for (int i = 0; i < P.length; i++) {
      P[i] = new Point(i, 0);
    }

    for (int i = 0; i < P.length; i++) {
      P[i].afficher();
      System.out.println(P[i].distance(P[0]));
      System.out.println();
    }
  }
}
