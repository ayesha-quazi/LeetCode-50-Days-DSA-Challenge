class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return ++j; 
    }
}

// Time complexity: O(N) as here we could 've many nums so we've used 'N'
// Space complexity: O(1) this 'll remain the same.
