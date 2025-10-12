public class TestLivre {
  public static void main(String[] args) {
    Livre l0 = new Livre("INF101", "Introduction a l'Algorithmique", "Thomas H. Cormen", 120.0);
    Livre l1 = new Livre("ECO202", "Le Capital au XXIe siecle", "Thomas Piketty", 95.0);
    Livre l2 = new Livre("ROM303", "Les Miserables", "Victor Hugo", 45.5);

    System.out.println("Livre 0 :");
    l0.afficher();
    System.out.println();
    System.out.println("Livre 1 :");
    l1.afficher();
    System.out.println();
    System.out.println("Livre 1 :");
    l0.afficher();
    System.out.println();

    // System.out.println(l0.code);
  }
}
