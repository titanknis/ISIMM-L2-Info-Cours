package ex5.pkg2;

import ex5.pkg1.A;

public class E {
  public void TestAccess() {
    A a = new A();
    System.out.println("Test d'accès dans la Classe E (classe non héritée d'un autre package)");
    System.out.println("x = " + a.x); // erreur
    System.out.println("y = " + a.y);
    System.out.println("z = " + a.z); // erreur
    System.out.println("w = " + a.w); // erreur
  }
}
