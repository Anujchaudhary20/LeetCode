class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1; // Initialize the count of unique elements to 1
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Overwrite the next unique element
                k++;
            }
        }
        
        return k;
    }
}