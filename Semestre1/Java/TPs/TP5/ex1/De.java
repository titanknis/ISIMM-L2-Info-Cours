package ex1;

public class De {
  private int val;

  public void jeter() {
    val = (int) (Math.random() * 6) + 1;
  }

  public De() {
    jeter();
  }

  public int getValue() {
    return val;
  }

  public void afficher() {
    System.out.println("la valeur obtenue est : " + val);
  }
}
