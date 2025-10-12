public class Score {
  String nom;
  int score;

  public Score(String nom, int score) {
    this.nom = nom;
    this.score = score;
  }

  public Score(String nom) {
    this.nom = nom;
    this.score = 0;
  }

  public void afficher() {
    System.out.println("nom = " + nom);
    System.out.println("score = " + score);
  }

  public void ajouteurPoints(int nbPoints) {
    this.score += nbPoints;
  }
}
