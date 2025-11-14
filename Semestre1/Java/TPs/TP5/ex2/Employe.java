package ex2;

public class Employe {
  private String nom;
  private String prenom;
  private String statut;

  public Employe(String nom, String prenom, String statut) {
    this.nom = nom;
    this.prenom = prenom;
    this.statut = statut;
  }

  public void afficher() {
    System.out.println(
        "employe : " + nom + "   " + "prenom : " + prenom + "    " + "statut : " + statut);
  }
}
