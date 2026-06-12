class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        int[] c = Arrays.copyOf(nums, nums.length);
        int[] ans = new int[nums.length+nums.length];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = c[i];
        }
        return ans;
    }
}