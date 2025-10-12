import java.util.Scanner;

public class Ex2 {
  public static int digitsSum(int n) {
    int s = 0;
    while (n > 0) {
      s += n % 10;
      n /= 10;
    }
    return s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n : ");
    int n = sc.nextInt();

    System.out.println(digitsSum(n));

    sc.close();
  }
}
