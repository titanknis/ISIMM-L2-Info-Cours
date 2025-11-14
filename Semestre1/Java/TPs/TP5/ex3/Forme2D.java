package ex3;

public class Forme2D {
  private String nom;

  public Forme2D(String nom) {
    this.nom = nom;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String toString() {
    return "Forme2D : " + nom;
  }
}
