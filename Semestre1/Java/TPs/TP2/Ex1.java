import java.util.Scanner;

public class Ex1 {

  public static int sum(int n) {
    // if (n > 0) return n + sum(n - 1);
    // else return 0;
    return (n + 1) * n / 2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n : ");
    int n = sc.nextInt();

    System.out.println(sum(n));

    sc.close();
  }
}
