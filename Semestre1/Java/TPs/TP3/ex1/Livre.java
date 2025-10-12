class Livre {
  private String code;
  private String titre;
  private String auteur;
  private double prix;

  public Livre(String c, String t, String a, double p) {
    this.code = c;
    this.titre = t;
    this.auteur = a;
    this.prix = p;
  }

  public void afficher() {
    System.out.println("	code = " + code);
    System.out.println("	titre = " + titre);
    System.out.println("	auteur = " + auteur);
    System.out.println("	prix = " + prix);
  }
}
