class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,seccount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                seccount=Math.max(count,seccount);
            }else if(nums[i]==0){
                count=0;
            }
        }
        return seccount;
    }
}