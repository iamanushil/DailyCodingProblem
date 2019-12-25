import java.util.HashMap;
import java.util.Map;
/*
Google:
Given a list of numbers and a number k, 
return whether any two numbers from the list add up to k.

For example, 
given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/

class Day_1 {
    
    /*
    // Brute Force T: O(n^2), S: O(1)
    // We just search for if the pair exists or not
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target ) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
    */
    
    // Using HashMap, T: O(n), S: O(n)
    public int[] twoSum(int[] nums, int target) { 
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {          // check if the elements are of not the same psoition
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}