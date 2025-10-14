public class Main {
  public static void main(String[] args) {
    Vecteur v = new Vecteur(5, 2);
    Vecteur u = new Vecteur(4, 2);
    Vecteur w = Vecteur.somme(v, v);
    Vecteur z = Vecteur.somme(v, u);

    v.affiche();
    u.affiche();
    w.affiche();
    // z.affiche();
    System.out.println(w.prod_scal(v.coordinates, v.coordinates));
  }
}
