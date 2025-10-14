public class Vecteur {
  public double[] coordinates;

  public Vecteur(int n) {
    coordinates = new double[n];
    for (int i = 0; i < n; i++) coordinates[i] = 0;
  }

  public Vecteur(int n, double x) {
    coordinates = new double[n];
    for (int i = 0; i < n; i++) coordinates[i] = x;
  }

  public Vecteur(double[] v) {
    coordinates = new double[v.length];
    for (int i = 0; i < v.length; i++) coordinates[i] = v[i];
  }

  public double prod_scal(double[] v, double[] u) {
    double p = 0;
    if (v.length != u.length) return 0;
    for (int i = 0; i < v.length; i++) p += v[i] * u[i];
    return p;
  }

  public static Vecteur somme(Vecteur v, Vecteur u) {
    if (v.coordinates.length != u.coordinates.length) return null;
    Vecteur w = new Vecteur(v.coordinates.length);
    for (int i = 0; i < w.coordinates.length; i++)
      w.coordinates[i] = v.coordinates[i] + u.coordinates[i];
    return w;
  }

  public void affiche() {
    System.out.println("dimension = " + coordinates.length);

    System.out.print("[" + coordinates[0]);
    for (int i = 1; i < coordinates.length; i++) System.out.print(", " + coordinates[i]);
    System.out.println("]");
  }
}
