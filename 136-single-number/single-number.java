class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (int i : freq.keySet()) {
            if (freq.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}