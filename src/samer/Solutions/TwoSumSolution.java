package samer.Solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        // Define hashmap which will store the values in array
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            // Each iteration, we check if we have 'target-current' already in map, which means we found our pair
            if(map.containsKey(target-nums[i])) {
                return new int[] {
                        map.get(target-nums[i]),
                        i
                };
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
