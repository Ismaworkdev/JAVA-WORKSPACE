package leet_code;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int array[] = {2, 7, 11, 15};
        int array1[] = {3, 2, 4};
        int array2[] = {3, 3};
        System.out.println(Arrays.toString(twoSum(array, 9)));
        System.out.println(Arrays.toString(twoSum(array1, 6)));
        System.out.println(Arrays.toString(twoSum(array2, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int uno = 0, dos = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    uno = i;
                    dos = j;
                }
            }
        }
        return new int[]{uno, dos};
    }
}


