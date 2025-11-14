package ex4;

public class LigneDeFacture {
  private Produit p1;
  private int qteVendue;

  public LigneDeFacture(Produit p1, int qteVendue) {
    this.p1 = p1;
    this.qteVendue = qteVendue;
    p1.retirerqt(qteVendue);
  }

  public Produit getP1() {
    return p1;
  }

  public void setP1(Produit p1) {
    this.p1 = p1;
  }

  public int getQte() {
    return qteVendue;
  }

  public void setQte(int qte) {
    this.qteVendue = qte;
  }

  public double sousTotal() {
    return (p1.getPrix()) * qteVendue;
  }

  public void afficher() {
    System.out.println(
        "-----------------------info ligne de facture-------------------------------------\n");
    p1.afficher();
    System.out.println("quantite:\n" + qteVendue);
  }
}
