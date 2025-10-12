public class TestRectangle {
  public static void main(String[] args) {
    Rectangle R[] = new Rectangle[15];
    for (int i = 0; i < R.length; i++) {
      R[i] = new Rectangle(i, 2 * i);
    }
    for (int i = 0; i < R.length; i++) {
      R[i].afficher();
    }
  }
}
