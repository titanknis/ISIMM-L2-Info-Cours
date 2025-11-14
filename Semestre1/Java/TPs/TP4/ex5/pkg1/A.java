package ex5.pkg1;

public class A {
  private int x;
  public int y;
  protected int z;
  int w;

  public A() {
    x = 1;
    y = 2;
    z = 3;
    w = 4;
  }

  public void TestAccess() {
    System.out.println("depuis la classe A");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    System.out.println("w = " + w);
  }
}
