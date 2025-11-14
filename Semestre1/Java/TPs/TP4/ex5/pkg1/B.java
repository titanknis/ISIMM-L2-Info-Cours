package ex5.pkg1;

public class B extends A {
  public void TestAccess() {
    System.out.println("--- Test d'accès dans la Classe B (sous-classe du même package) ---");
    System.out.println("x = " + x); // erreur
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    System.out.println("w = " + w);
  }
}
