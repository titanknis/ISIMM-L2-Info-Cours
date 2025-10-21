public class TestBibliotheque {
  public static void main(String[] args) {
    Bibliotheque b = new Bibliotheque(1000);
    Livre l0 = new Livre("how to disappear", "knis", 456, 3);
    Livre l1 = new Livre("how to change identity", "ali", 114, 4);
    Livre l2 = new Livre("how to defend", "rayen", 361, 9);
    Livre l3 = new Livre("how to attack", "knis", 188, 1);
    b.ajouterUnLivre(l0);
    b.ajouterUnLivre(l1);
    b.ajouterUnLivre(l2);
    b.ajouterUnLivre(l3);
    b.afficherTous();

    Livre liv = b.chercherParTitre("how to defend");
    liv.afficher();
  }
}
