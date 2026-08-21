class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],sum=0,ans=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(ans,nums[i]);
            if(sum<0){
                sum=0;
            }
            max=Math.max(max,sum);
        }
        if(max==0){
            return ans;
        }
        return max;
    }
}