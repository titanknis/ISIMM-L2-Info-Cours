import java.util.Arrays;

public class Main {

  public static boolean[] sieveOfEratosthenes(int n) {
    if (n < 2) return new boolean[n];

    boolean[] prims = new boolean[n];
    Arrays.fill(prims, true);
    prims[0] = prims[1] = false;

    for (int i = 2; i * i < n; i++) {
      if (prims[i]) {
        for (int j = i * i; j < n; j += i) {
          prims[j] = false;
        }
      }
    }
    return prims;
  }

  public static void main(String[] args) {
    boolean[] prims = sieveOfEratosthenes(110);
    for (int i = 0; i < prims.length; i++) {
      if (prims[i]) {
        System.out.println(i);
      }
    }
  }
}
