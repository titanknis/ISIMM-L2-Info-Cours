import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n : ");
    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("T[" + i + "] : ");
      nums[i] = sc.nextInt();
    }

    int negative = 0;
    int max = nums[0];
    for (int i = 0; i < n; i++) {
      if (nums[i] < 0) negative++;
      if (nums[i] > max) max = nums[i];
    }

    System.out.println("negative : " + negative);
    System.out.println("max : " + max);
    sc.close();
  }
}
