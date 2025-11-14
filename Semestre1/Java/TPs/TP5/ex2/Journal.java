package ex2;

public class Journal {
  private String nom;
  private Date date;

  public Journal(String nom, Date date) {
    this.nom = nom;
    this.date = date;
  }

  public void afficher() {
    System.out.println("nom : " + nom + "   " + "date : " + "   " + date);
  }
}
