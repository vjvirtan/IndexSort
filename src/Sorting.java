public class Sorting {
  public static int[] sort(int[] nums, int[] numsB) {
    int max = 1000000;
    int[] arrange = new int[max * 2 + 1];
    int[] sorted = new int[nums.length + numsB.length];

    for (int e : nums) {
      arrange[e + max] = arrange[e + max] + 1;
    }
    for (int e : numsB) {
      arrange[e + max] = arrange[e + max] + 1;
    }
    int i = 0;
    for (int y = 0; y < arrange.length; y++) {
      if (arrange[y] != 0) {
        for (int x = 0; x < arrange[y]; x++) {
          sorted[i] = y - max;
          i++;
        }
      }
    }
    return sorted;
  }
}
