package search.l153_find_minimum_in_rotated_sorted_array;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while( l < r){
            int mid = (l + r) / 2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return nums[l];
    }
}
