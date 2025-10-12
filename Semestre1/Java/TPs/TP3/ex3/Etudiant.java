public class Etudiant {
  private String matricule;
  private String nom;
  private String prenom;
  private double moyenne;

  public Etudiant(String matricule, String nom, String prenom, double moyenne) {
    this.matricule = matricule;
    this.nom = nom;
    this.prenom = prenom;
    this.moyenne = moyenne;
  }

  public String GetMatricule() {
    return this.matricule;
  }

  public void SetMatricule(String matricule) {
    this.matricule = matricule;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public double getMoyenne() {
    return this.moyenne;
  }

  public void getMoyenne(double moyenne) {
    this.moyenne = moyenne;
  }

  public void afficher() {
    System.out.println("matricule = " + matricule);
    System.out.println("nom = " + nom);
    System.out.println("prenom = " + prenom);
    System.out.println("moyenne = " + moyenne);
  }

  public boolean admis() {
    return moyenne >= 10;
  }
}
