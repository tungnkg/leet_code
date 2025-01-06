package arrray.l26_remove_duplicate_from_sorted_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[k++] = nums[i + 1];
            }
        }
    }
}
