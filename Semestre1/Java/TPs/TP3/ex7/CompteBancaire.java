public class CompteBancaire {
  private int num;
  private String nom;
  private double solde;

  public CompteBancaire(int num, String nom, double solde) {
    this.num = num;
    this.nom = nom;
    this.solde = solde;
  }

  public void deposer(double montant) {
    this.solde += montant;
  }

  public boolean retirer(double montant) {
    if (montant <= solde) {
      solde -= montant;
      return true;
    } else return false;
  }

  public void afficher() {
    System.out.println("num = " + num);
    System.out.println("nom = " + nom);
    System.out.println("solde = " + solde);
  }
}
