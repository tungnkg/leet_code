package l349_intersection_of_two_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> carrySet = new HashSet<>();

        for(int i: nums1){
            carrySet.add(i);
        }
        int k = 0;
        int[] result = new int[carrySet.size()];
        for(int i: nums2){
            if(carrySet.contains(i)){
                carrySet.remove(i);
                result[k++] = i;
            }
        }
        return result;
    }
}
