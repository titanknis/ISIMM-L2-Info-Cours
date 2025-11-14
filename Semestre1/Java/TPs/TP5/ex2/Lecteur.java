package ex2;

public class Lecteur {
  private String nom;
  private String prenom;
  private String adresse;
  private Livre[] listeLivresEmprunter;
  private int nbLivresEmprunter;

  public Lecteur(String nom, String prenom, String adresse) {
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
    this.listeLivresEmprunter = new Livre[5];
    this.nbLivresEmprunter = 0;
  }

  public Date emprunter(Livre L) {
    if (!(L.isDisponible())) {
      System.out.println("le livre " + L.getTitre() + "n'est pa disponible");
      return null;
    }
    if (nbLivresEmprunter >= listeLivresEmprunter.length) {
      System.out.println("le nombre maximum est atteint");
      return null;
    }
    Date dateEmprunte = new Date();
    Date dateDeRetour = dateEmprunte.ajouterJour(7);
    L.setDisponible(false);
    L.setEmprunteur(this);
    listeLivresEmprunter[nbLivresEmprunter++] = L;
    System.out.println("la date de retour de votre livre est : ");
    return dateDeRetour;
  }

  public Livre[] LivresEmprunter() {
    Livre[] livres = new Livre[nbLivresEmprunter];
    for (int i = 0; i < nbLivresEmprunter; i++) {
      livres[i] = listeLivresEmprunter[i];
    }
    return livres;
  }

  public void afficher() {
    System.out.println("lecteur : " + nom + "  " + prenom);
    if (nbLivresEmprunter == 0) System.out.println("aucun livre emprunte");
    else {
      for (int i = 0; i < nbLivresEmprunter; i++) {
        System.out.println(listeLivresEmprunter[i].getTitre());
      }
    }
  }
}
