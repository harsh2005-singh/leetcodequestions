class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            count+=nums[i];
        }
        return ((n*(n+1))/2)-count;
    }
}