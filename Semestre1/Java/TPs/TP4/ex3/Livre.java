public class Livre {
  private String titre;
  private String auteur;
  private int nbPages;
  private int nbExemplairesDisponibles;

  public Livre(String titre, String auteur, int nbPages, int nbExemplairesDisponibles) {
    this.titre = titre;
    this.auteur = auteur;
    this.nbPages = nbPages;
    this.nbExemplairesDisponibles = nbExemplairesDisponibles;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public String getAuteur() {
    return auteur;
  }

  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }

  public int getNbPages() {
    return nbPages;
  }

  public void setNbPages(int nbPages) {
    this.nbPages = nbPages;
  }

  public int getNbExemplairesDisponibles() {
    return nbExemplairesDisponibles;
  }

  public void setNbExemplairesDisponibles(int nbExemplairesDisponibles) {
    this.nbExemplairesDisponibles = nbExemplairesDisponibles;
  }

  public void emprunter() {
    if (nbExemplairesDisponibles <= 0) {
      System.err.println("le livre " + titre + " n'est pas disponible");
      return;
    }
    nbExemplairesDisponibles--;
  }

  public void retourner() {
    nbExemplairesDisponibles++;
  }

  public void afficher() {
    System.out.println("titre = " + titre);
    System.out.println("auteur = " + auteur);
    System.out.println("nbPages = " + nbPages);
    System.out.println("nbExemplairesDisponibles = " + nbExemplairesDisponibles);
  }
}
