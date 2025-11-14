package ex5.pkg2;

import ex5.pkg2.A;
public class D extends A {
    public void testAccess() {
        System.out.println("--- Test d'accès dans la Classe D (sous-classe d'un autre package) ---");
        System.out.println("x = "+x);//erreur
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("w = "+w);//erreur
    }
