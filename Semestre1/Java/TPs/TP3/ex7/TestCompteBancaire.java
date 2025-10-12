public class TestCompteBancaire {
  public static void main(String[] args) {
    CompteBancaire CB[] = new CompteBancaire[100];
    CB[0] = new CompteBancaire(0, "Ali Laouti", 1000000000);
    CB[1] = new CompteBancaire(1, "rayen", -1000000000);
    for (int i = 2; i < CB.length; i++) {
      CB[i] = new CompteBancaire(i, "knis" + i, 10 * i);
      CB[i].deposer(1000);
      CB[i].retirer(100);
    }
    for (int i = 0; i < CB.length; i++) {
      CB[i].afficher();
      System.out.println();
    }
  }
}
