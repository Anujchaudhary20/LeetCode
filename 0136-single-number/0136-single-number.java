class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int n : nums) {
            freq.merge(n, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1)
             return e.getKey();
        }
        return -1;
    }
}