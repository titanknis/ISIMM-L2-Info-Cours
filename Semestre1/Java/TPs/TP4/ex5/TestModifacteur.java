package ex5;

import ex5.pkg1.*;
import ex5.pkg2.*;

public class TestModifacteur {
  public static void main(String[] args) {
    A a = new A();
    a.TestAccess();
    B b = new B();
    b.TestAccess();
    C c = new C();
    c.TestAccess();
    D d = new D();
    d.TestAccess();
    E e = new E();
    e.TestAccess();
  }
}
