package ex1;

import java.util.Scanner;

public class test2De {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    De d = new De();
    System.out.println("donner x");
    int x = scanner.nextInt();
    for (int i = 0; i < x; i++) {
      d.jeter();
      d.afficher();
    }
  }
}
