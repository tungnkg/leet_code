package arrray.l1480_running_sum_of_1d_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
            System.out.println(Arrays.toString(result));
    }

    public static int[] runningSum(int[] nums) {
        for(int i=1; i < nums.length; ++i){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
