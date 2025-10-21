public class Robot {
  private int x;
  private int y;
  private int orientation;

  public Robot(int x, int y, int orientation) {
    this.x = x;
    this.y = y;
    this.orientation = orientation;
  }

  public Robot(int x, int y) {
    this.x = x;
    this.y = y;
    this.orientation = 1;
  }

  public Robot() {
    this.x = 0;
    this.y = 0;
    this.orientation = 1;
  }

  public void tournerADroite() {
    if (++orientation == 5) orientation = 1;
  }

  public void tournerAGauche() {
    if (--orientation == 0) orientation = 4;
  }

  public void avancer(int d) {
    if (orientation == 1) y += d;
    if (orientation == 2) x += d;
    if (orientation == 3) y -= d;
    if (orientation == 4) x -= d;
  }

  public void afficher() {
    System.out.println("(" + x + ',' + y + ")");
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getOrientation() {
    return orientation;
  }

  public void setOrientation(int orientation) {
    this.orientation = orientation;
  }
}
