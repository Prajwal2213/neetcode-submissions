class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> trav = new HashMap<>();
        int[] res = new int[2];

        for(int iter = 0; iter < nums.length; iter++){
            trav.put(nums[iter],iter);
        }

    
        for(int iter = 0; iter < nums.length; iter++){
            int sElem = target - nums[iter];
             if(trav.containsKey(sElem) && trav.get(sElem) != iter){
                return new int[] { iter, trav.get(sElem) };
            }
        }

        return new int[] {};

       
    }
}
