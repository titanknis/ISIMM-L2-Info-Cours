package ex4;

public class Main {
  public static void main(String[] args) {
    Produit p1 = new Produit("stylo", 1.5, 100);
    Produit p2 = new Produit("cahier", 3.20, 50);
    Produit p3 = new Produit("classeur", 5.0, 20);
    p1.afficher();
    p2.afficher();
    p3.afficher();
    LigneDeFacture l1 = new LigneDeFacture(p1, 10);
    LigneDeFacture l2 = new LigneDeFacture(p2, 5);
    LigneDeFacture l3 = new LigneDeFacture(p3, 2);
    Facture f = new Facture("F001", 10);
    f.ajoterLigneDeFacture(l1);
    f.ajoterLigneDeFacture(l2);
    f.ajoterLigneDeFacture(l3);
    System.out.println("Facture");
    f.afficher();
    p1.afficher();
    p2.afficher();
    p3.afficher();
  }
}
