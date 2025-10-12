public class Ex4 {
  public static int sum(int[] nums) {
    int s = 0;
    // for (int i = 0; i < nums.length; i++) {
    //   s += nums[i];
    // }
    for (int num : nums) {
      s += num;
    }
    return s;
  }

  public static double moyenne(int[] nums) {
    return sum(nums) / nums.length;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 300};
    System.out.println(sum(nums));
    System.out.println(moyenne(nums));
  }
}
