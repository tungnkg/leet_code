package search.l704_binary_search;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(main.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = (r+l)/2;
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
