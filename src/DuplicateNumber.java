import java.util.Arrays;

public class DuplicateNumber {
    public static int[] removeDuplicates(int[] nums) {
//        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] intArr={1, 1, 1, 1, 2, 2, 2, 3, 3};
      int[] i = removeDuplicates(intArr);
        System.out.println(Arrays.toString(i));
    }
}
