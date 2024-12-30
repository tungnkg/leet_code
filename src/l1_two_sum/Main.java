package l1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }

    public int[] solve(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
