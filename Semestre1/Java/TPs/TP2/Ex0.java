import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entrez un nombre entier : ");
    int n = sc.nextInt();
    System.out.println("Vous avez saisi : " + n);

    System.out.print("Entrez zotre nom : ");
    String nom = sc.nextLine();
    System.out.println("Bonjour, " + nom);

    System.out.print("Entrez une note (nombre reel) : ");
    double note = sc.nextDouble();
    System.out.println("Votre note est : " + note);

    sc.close();
  }
}
