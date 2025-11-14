package ex4;

public class Facture {
  private String codeFacture;
  private LigneDeFacture[] ligne;
  private int nbLigneDeFacture;

  public Facture(String codeFacture, int taille) {
    this.codeFacture = codeFacture;
    this.ligne = new LigneDeFacture[taille];
    this.nbLigneDeFacture = 0;
  }

  public String getCodeFacture() {
    return codeFacture;
  }

  public void setCodeFacture(String codeFacture) {
    this.codeFacture = codeFacture;
  }

  public LigneDeFacture[] getT() {
    return ligne;
  }

  public void setT(LigneDeFacture[] t) {
    this.ligne = t;
  }

  public int getNbLigneDeFacture() {
    return nbLigneDeFacture;
  }

  public void setNbLigneDeFacture(int nbLigneDeFacture) {
    this.nbLigneDeFacture = nbLigneDeFacture;
  }

  public void ajoterLigneDeFacture(LigneDeFacture idf) {
    if (nbLigneDeFacture < ligne.length) {
      ligne[nbLigneDeFacture] = idf;
      nbLigneDeFacture++;
      System.out.println("ajout de ligne avec succe");
    } else {
      System.out.println("echec");
    }
  }

  public double total() {
    double total = 0;
    for (int i = 0; i < nbLigneDeFacture; i++) {
      total += ligne[i].sousTotal();
    }
    return total;
  }

  public void afficher() {
    System.out.println("code de facture=" + codeFacture);
    for (int i = 0; i < nbLigneDeFacture; i++) {
      ligne[i].afficher();
    }
    System.out.println("sous total = " + total());
  }
}
