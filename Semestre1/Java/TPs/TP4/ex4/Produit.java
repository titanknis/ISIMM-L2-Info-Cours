package ex4;

public class Produit {
  private String nom;
  private Double prix;
  private int qt;

  public Produit(String n, Double p, int q) {
    nom = n;
    prix = p;
    qt = q;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String n) {
    this.nom = n;
  }

  public Double getPrix() {
    return prix;
  }

  public void setprix(Double p) {
    this.prix = p;
  }

  public int getQt() {
    return qt;
  }

  public void setQt(int q) {
    this.qt = q;
  }

  public int ajouterqt(int qte) {
    return (qt += qte);
  }

  public void retirerqt(int qte) {
    if (qte <= qt) {
      System.out.println("la quantite est deja 0");
    } else qt -= qte;
  }

  public Double valstck() {
    return (prix * qt);
  }

  public void afficher() {
    System.out.println(
        "-----------------------info produit-------------------------------------\n");
    System.out.println("nom:\n" + nom);
    System.out.println("prix:\n" + prix);
    System.out.println("quantite:\n" + nom);
  }
}
