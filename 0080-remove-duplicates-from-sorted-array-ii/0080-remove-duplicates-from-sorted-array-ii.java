class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int iIndex = 2;
        for(int cIndex = 2;cIndex<nums.length;cIndex++){
            if(nums[cIndex]!=nums[iIndex-2]){
                nums[iIndex]=nums[cIndex];
                iIndex++;}
            }    
            return iIndex;
}}