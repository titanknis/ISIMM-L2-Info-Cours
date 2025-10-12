import java.util.Scanner;

public class Ex3 {
  public static double celciusToFahrenheit(int c) {
    return (9.0 / 5) * c + 32;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("c : ");
    int c = sc.nextInt();

    System.out.println((celciusToFahrenheit(c)));

    sc.close();
  }
}
