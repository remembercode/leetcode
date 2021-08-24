/ * 
    force
    Runtime: 53 ms, faster than 17.90% of Java online submissions for Two Sum.
    Memory Usage: 39.1 MB, less than 76.12% of Java online submissions for Two Sum.
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {        
        int first_p = 0;
        int second_p = 0;
        int[] result = new int[2];
        for(first_p = 0; first_p < nums.length ; first_p = first_p + 1)
        {
            second_p = first_p + 1;
            while (second_p < nums.length)
            {
                if (nums[first_p] + nums[second_p] == target)
                {

                    result[0] = first_p;
                    result[1] = second_p;                  
                }
                second_p = second_p + 1;
            }                     
        }
        return result;          
    }
}

/ * 
    hashmap
    Runtime: 31 ms, faster than 40.54% of Java online submissions for Two Sum.
    Memory Usage: 40.5 MB, less than 13.34% of Java online submissions for Two Sum.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> Diff = new HashMap<Integer, Integer>();
        
        int first_p = 0;
        int second_p = 0;
        int[] result = new int[2];
        for(first_p = 0; first_p < nums.length ; first_p = first_p + 1)
        {
            int diff_ = target - nums[first_p];
            int has = -1;
            try
            {
                has = Diff.get(diff_);

            }catch(Exception e1)
            {
               has = -1;
            }
            if (has >= 0) 
            {
                result[0] = has;
                result[1] = first_p;
                break;
            }
            Diff.put(nums[first_p], first_p);          
        }
        return result;          
    }
}
