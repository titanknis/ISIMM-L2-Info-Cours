import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("timestamp : ");
    int s = sc.nextInt();
    int d = s / (86400);
    s %= (86400);
    int h = s / (3600);
    s %= (3600);
    int m = s / (60);
    s %= (60);

    System.out.println(
        "cette duree equivaut a "
            + d
            + " jours et "
            + h
            + " heures et "
            + m
            + " minutes et "
            + s
            + " secondes");

    sc.close();
  }
}
