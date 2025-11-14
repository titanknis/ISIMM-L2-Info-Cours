package ex1;

import java.util.Scanner;

public class test3De {
  public static void main(String[] args) {
    De d1 = new De();
    De d2 = new De();
    Scanner scanner = new Scanner(System.in);
    System.out.println("donner x");
    int x = scanner.nextInt();
    for (int i = 0; i < x; i++) {
      System.out.println("tour" + (i + 1));
      d1.jeter();
      d1.afficher();
      d2.jeter();
      d2.afficher();
      if (d1.getValue() == d2.getValue()) System.out.println("gangne");
    }
  }
}
