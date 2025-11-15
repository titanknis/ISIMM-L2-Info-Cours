
class A {

    int x=5;

    void m() {
        System.out.println("méthode m() de A");
    }
}

class B extends A {

    int x=10;

    void m() {
        System.out.println("méthode m() de B");
    }
}

class C extends B {

    int x=15, a;

    final void m() {
        System.out.println("méthode m() de C");
    }

    void test() {
        System.out.println("------test--------");
        a = super.x; // a reçoit la valeur de la variable x de la classe B
        //a = super.super.x; // erreur syntaxique
        a = ((B) this).x;   // a reçoit la valeur de la variable x de la classe B
        a = ((A) this).x;   // a reçoit la valeur de la variable x de la classe A
        super.m();         // Appel à la méthode m de la classe B
        //super.super.m();   // erreur syntaxique
        ((B) this).m();     // Appel à la méthode m de la classe C (et non B)
    }
}

public class HeritageEtMasquage {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        ((A) b).m();
        ((A) c).m();
        ((B) c).m();
        
        c.test();
    }
}
