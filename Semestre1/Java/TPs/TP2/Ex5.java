public class Ex5 {
  public static void main(String[] args) {
    int[] even = new int[10];
    int[] odd = new int[10];
    for (int i = 0; i < 10; i++) {
      even[i] = 2 * i;
      odd[i] = 2 * i + 1;
    }
    int[] nums = new int[20];

    for (int i = 0; i < 10; i++) {
      nums[2 * i] = even[i];
      nums[2 * i + 1] = odd[i];
    }

    System.out.println(java.util.Arrays.toString(nums));
  }
}
