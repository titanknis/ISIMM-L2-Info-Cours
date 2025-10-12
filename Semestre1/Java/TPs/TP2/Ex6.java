import java.util.Scanner;

public class Ex6 {

  public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    return b != 0 ? gcd(b, a % b) : a;
  }

  public static int gcd2(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    int temp;
    while (b != 0) {
      temp = a;
      a = b;
      b = temp % b;
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a : ");
    int a = sc.nextInt();
    System.out.print("b : ");
    int b = sc.nextInt();

    System.out.println("recursive gcd : " + gcd(a, b));
    System.out.println("iterative gcd : " + gcd2(a, b));

    sc.close();
  }
}
