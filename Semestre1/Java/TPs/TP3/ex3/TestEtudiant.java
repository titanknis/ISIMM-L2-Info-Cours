public class TestEtudiant {
  public static void main(String[] args) {
    Etudiant E[] = new Etudiant[50];
    for (int i = 0; i < E.length; i++) {
      E[i] = new Etudiant("E" + i, "E" + i, "E" + i, i % 21);

      E[i].afficher();
      if (E[i].admis()) {
        System.out.println("Admis!");
      } else {
        System.out.println("Refuse.");
      }
      System.out.println();
    }
  }
}
