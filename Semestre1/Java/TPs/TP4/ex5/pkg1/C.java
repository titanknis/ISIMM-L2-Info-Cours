package ex5.pkg1;

public class C {
  public void TestAccess() {
    A a = new A();
    System.out.println(
        "--- Test d'accès dans la Classe C (classe non héritée du même package) ---");
    System.out.println("x = " + a.x); // erreur
    System.out.println("y = " + a.y);
    System.out.println("z = " + a.z);
    System.out.println("w = " + a.w);
  }
}
