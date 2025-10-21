public class Bibliotheque {
  private Livre livres[];
  private int taille;

  public Bibliotheque(int taille_max) {
    this.taille = 0;
    livres = new Livre[taille_max];
  }

  public void ajouterUnLivre(Livre l) {
    livres[taille++] = l;
  }

  public void afficherTous() {
    for (int i = 0; i < taille; i++) {
      System.out.println("livres[" + i + "]");
      livres[i].afficher();
      System.out.println();
    }
  }

  public Livre chercherParTitre(String t) {
    for (int i = 0; i < taille; i++) {
      if (livres[i].getTitre().equals(t)) return livres[i];
    }
    return null;
  }
}
